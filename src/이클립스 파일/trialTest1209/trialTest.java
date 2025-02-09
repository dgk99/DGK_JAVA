package trialTest1209;

import java.util.Scanner;

public class trialTest {

	static void menu() {
		System.out.println("===== 빙고 게임 메뉴 =====");
		System.out.println("1. 빙고판 생성");
		System.out.println("2. 숫자별 발생 빈도 분석");
		System.out.println("3. 빙고판 출력");
		System.out.println("4. 종료");
		
	}
	
	public static void main(String[] args) {
		
		// 빙고 생성 프로그램
		
		Scanner sc = new Scanner(System.in);
		// 변수 모음
		int menuInput = 0; // 메뉴 입력 변수
		int sizeN = 0; // N 값 변수
		int startNum = 0; int endNum = 0; // 난수 범위 시작, 종료 값 변수
		int sizeM = 0; // 빙고 매트릭스 수 변수
		int[][][] bingoBoard = new int[0][][]; // 빙고판 3차원 배열
		
		
		while (true) {
			// 메뉴 출력
			menu();
			System.out.print("메뉴 선택: ");
			menuInput = sc.nextInt();
			// 4번을 입력 시, 프로그램 종료
			if (menuInput == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 입력 받은 메뉴 값에 따라 해당 메뉴 출력
			switch (menuInput) {
			case 1:
				// 1. 빙고판 생성
				while (true) {
					// 1-1 빙고판 크기 N을 3이상 9이하의 홀수로 입력받음
					System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
					sizeN = sc.nextInt();
					// 제대로 입력 받았다면 탈출
					if (sizeN >= 3 && sizeN <= 9 && sizeN % 2 == 1) {
						break;
					}
					System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
				}
				// 1-2 난수 범위를 조건에 맞게 입력받기.
				while (true) {
					System.out.print("난수 범위의 시작값을 입력하세요: ");
					startNum = sc.nextInt();
					System.out.print("난수 범위의 종료값을 입력하세요: ");
					endNum = sc.nextInt();
					// 조건 (종료값 - 시작값 + 1) >= N x N
					// 제대로 입력 받았다면 탈출
					if (endNum - startNum + 1 >= sizeN * sizeN) {
						break;
					}
					System.out.println("종료 값 - 시작 값이 N X N 보다 크거나 같아야 합니다.");
				}
				// 1-3 빙고 매트릭스 수 M를 1이상 7이하의 값으로 입력받기
				while (true) {
					System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7이하): ");
					sizeM = sc.nextInt();
					// 제대로 입력 받았다면 탈출
					if (sizeM >= 1 && sizeM <= 7) {
						break;
					}
					System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
				}
				
				// 위 값을 토대로 3차원 배열의 빙고 매트릭스 생성
				bingoBoard = new int[sizeM][sizeN][sizeN];
				

				int bingoSize = sizeN * sizeN; // 빙고 크기 변수
				
				// 이 난수 생성, 중복 검사, 빙고 판 채우기를 M번 반복
				for (int m = 0; m < sizeM; m++) {
					// 중복 없는 난수를 저장할 1차원 배열
					int[] randVector = new int[endNum - startNum + 1];
					
					boolean overlapFlag = false; // 중복 값이 있나 없나 확인하는 플래그
					
					// 1차원 배열에 난수 생성 후 중복 값 검사
					for (int c = 0; c < bingoSize;) {
						int randNum = (int)(Math.random() * (endNum - startNum + 1)) + startNum;
						overlapFlag = false;
						for (int r = 0; r < c; r++) {
							if (randNum == randVector[r]) {
								overlapFlag = true;
								break;
							}
						} // 중복이 없다면, 1차원 배열에 값 추가
						if (!overlapFlag) {
							randVector[c] = randNum;
							c++;
						}
						
					}
					
					// 중복된 값이 없으니, 만들어 놓은 빙고판에 값 추가
					int v = 0;
					for (int c = 0; c < sizeN; c++) {
						for (int r = 0; r < sizeN; r++) {
							bingoBoard[m][c][r] = randVector[v];
							v++;
						}
					}
				}
				
				System.out.println("빙고 매트릭스가 생성되었습니다.");
				break;
				
			case 2:
				// 2. 숫자별 발생 빈도 분석콤보 점수 계산
				System.out.println("===== 숫자별 발생 빈도 =====");
				// 생성된 난수 범위의 수의 발생 빈도를 계산
				// 발생 빈도를 확인 할 종료값 - 시작값 + 1의 길이를 가지는 배열 생성
				int[] checkList = new int[endNum - startNum + 1];
				
				// 만들어진 빙고판을 1번 순회하며, 생성된 숫자를 카운트하기
				for (int m = 0; m < sizeM; m++) {
					for (int c = 0; c < sizeN; c++) {
						for (int r = 0; r < sizeN; r++) {
							int checkCount = bingoBoard[m][c][r];
							checkList[checkCount - startNum]++;
						}
					}
				}
				
				// 발생 빈도에 맞게 횟수와 퍼센테이지, 별을 출력
				// 발생 퍼센트 공식 = 발생 횟수 * 100.0 / M x N^2
				int outputNum = startNum;
				for (int i = 0; i < checkList.length; i++) {
					System.out.print(outputNum + ": " + checkList[i] + "회 " + ((checkList[i] * 100.0) / (sizeM * sizeN * sizeN)) + "% ");
					outputNum++;
					// 발생 횟수 및 퍼센트 출력 후 뒤에 발생 횟수 만큼 별 달기
					char star = '*';
					int starNum = checkList[i];
					for (int j = 0; j < starNum; j++) {
						System.out.print(star);
					}
					System.out.println();
				}
				System.out.println();
				
				
				break;
				
			case 3:
				// 3. 빙고판 출력
				for (int m = 0; m < sizeM; m++) {
					System.out.print("빙고 매트릭스 #" + (m + 1));
					for (int c = 0; c < sizeN; c++) {
						System.out.println();
						for (int r = 0; r < sizeN; r++) {
							System.out.print(bingoBoard[m][c][r] + "  ");
						}
						System.out.println();
					}
					System.out.println();
				}
				break;
				
				// 메뉴 이외의 값을 입력 시, 재입력
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			
			}
			
		}
		
	}

}
