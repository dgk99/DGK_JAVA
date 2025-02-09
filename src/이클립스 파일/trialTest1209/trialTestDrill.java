package trialTest1209;

import java.util.Scanner;

public class trialTestDrill {
	

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
		int sizeN = 0; // 빙고 N값 변수
		int startNum = 0; int endNum = 0; // 난수 범위 시작, 종료 값
		int sizeM = 0; // 빙고 매트릭스 M값 변수
		int[][][] bingoBoard = new int[0][][];
		
		
		while (true) {
			// 메뉴 출력
			menu();
			System.out.print("메뉴 선택: ");
			// 메뉴 입력 받기
			menuInput = sc.nextInt();
			
			// 메뉴 입력에서 4를 입력했다면, 프로그램 종료
			if (menuInput == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 입력한 메뉴에 따라 프로그램 실행
			switch (menuInput) {
			case 1:
				// 1. 빙고판 생성
				while (true) {
					// 1-1 빙고판 크기 N을 3이상 9이하의 홀수로 받기
					System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
					sizeN = sc.nextInt();
					// 제대로 입력했다면, 탈출
					if (sizeN >= 3 && sizeN <= 9 && sizeN % 2 == 1) {
						break;
					}
					System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
				}
				
				int bingoSize = sizeN * sizeN;
				
				// 1-2 난수 범위 시작 값과 종료 값을 조건에 따라 받기
				while (true) {
					System.out.print("난수 범위의 시작값을 입력하세요: ");
					startNum = sc.nextInt();
					System.out.print("난수 범위의 종료값을 입력하세요: ");
					endNum = sc.nextInt();
					// 조건: (종료값 - 시작값 + 1) >= N x N
					// 조건에 맞게 입력했다면, 탈출
					if ((endNum - startNum + 1) >= bingoSize) {
						break;
					}
					
					System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
				}
				
				// 1-3 빙고 매트릭스 수 M을 1이상 7이하의 정수로 입력 받기
				while (true) {
					System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1이상 7이하): ");
					sizeM = sc.nextInt();
					// 제대로 입력했다면, 탈출
					if (sizeM >= 1 && sizeM <= 7) {
						break;
					}
					System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
				}
				
				// 위 조건을 토대로 3차원 배열 생성
				bingoBoard = new int[sizeM][sizeN][sizeN];
				
				int randNum = 0; // 난수 변수
				boolean overLapFlag = false; // 중복 유무에 관한 플래그
				
				// 아래 조건을 매트릭수 수인 M번 반복하기
				for (int m = 0; m < sizeM; m++) {
					
					int[] randList = new int[bingoSize]; // 난수를 저장할 1차원 배열
					
					// 생성한 난수의 중복 값을 검사하여 N x N 길이의 1차원 배열에 저장
					for (int c = 0; c < bingoSize;) {
						// 빙고판을 채우기 위해 난수 생성
						randNum = (int)(Math.random() * (endNum - startNum + 1)) + startNum;
						overLapFlag = false;
						
						// 중복된다면, 반복문을 종료하고 다시 난수 생성
						for (int t = 0; t < c; t++) {
							if (randNum == randList[t]) {
								overLapFlag = true;
								break;
							}
						}
						// 중복되지 않는다면, 1차원 배열에 값 저장
						if (!overLapFlag) {
							randList[c] = randNum;
							c++;
						}
						
					}
					
					// 1차원 배열에 저장된 난수를 빙고판에 저장
					int v = 0;
					for (int c = 0; c < sizeN; c++) {
						for (int r = 0; r < sizeN; r++) {
							bingoBoard[m][c][r] = randList[v];
							v++;
						}
					}
					
				}
				
				break;
				
			case 2:
			// 2. 숫자별 발생 빈도 분석콤보 점수 계산
				System.out.println("===== 숫자별 발생 빈도 =====");
			// 길이가 (종료값 - 시작값 + 1)인 1차원 배열 생성
				int[] checkList = new int[endNum - startNum + 1];
			// 빙고판을 전체 순회 후, 난수 - 시작값에 대한 값을 인덱스로 하여 1차원 배열에 횟수로 저장
				for (int m = 0; m < sizeM; m++) {
					for (int c = 0; c < sizeN; c++) {
						for (int r = 0; r < sizeN; r++) {
							int checkNum = bingoBoard[m][c][r];
							checkList[checkNum - startNum]++;
						}
					}
				}
				
				// 저장된 횟수를 토대로 발생 빈도, 퍼센트, 별을 출력
				// 퍼센트 계산 - 발생 횟수 * 100.0 / sizeM * sizeN^2
				int outputNum = startNum;
				for (int i = 0; i < checkList.length; i++) {
					System.out.print(outputNum + ": " + checkList[i] + "회 (" + ((checkList[i] * 100.0) / (sizeM * sizeN * sizeN)) + "%)");
					outputNum++;
					char star = '*';
					for (int s = 0; s < checkList[i]; s++) {
						System.out.print(star);
					}
					System.out.println();
				}
				System.out.println();
			
				break;
				
			case 3:
			// 3. 빙고판 출력
				for (int m = 0; m < sizeM; m++) {
					System.out.println("빙고 매트릭스 #" + (m + 1));
					for (int c = 0; c < sizeN; c++) {
						for (int r = 0; r < sizeN; r++) {
							System.out.print(bingoBoard[m][c][r] + "\t");
						}
						System.out.println();
					}
					System.out.println();
				}
				break;
				
			default:
			// 잘못된 값을 입력한 경우, 재입력
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
			
		}
		
	}

}
