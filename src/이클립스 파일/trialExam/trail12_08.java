package trialExam;

import java.util.Scanner;

public class trail12_08 {
	
	static void menu() {
		System.out.println("===== 빙고 게임 메뉴 =====");
		System.out.println("1. 빙고판 생성");
		System.out.println("2. 숫자별 발생 빈도 분석");
		System.out.println("3. 빙고판 출력");
		System.out.println("4. 종료");
	}
	
	public static void main(String[] args) {

		// 빙고 생성 프로그램
		// 사용자로부터 값을 입력받고, 그 값에 따라 3차원의 빙고를 생성
		Scanner sc = new Scanner (System.in);
		int menuInput = 0; // 메뉴 입력 변수
		
		// 변수 모음
		int numN = 0; // 빙고판 행,열 변수
		int bingoSize = 0; // 빙고판 크기 변수
		int startNum = 0; int endNum = 0; // 난수 시작, 종료 값 변수
		int numM = 0; // 빙고 매트릭스 수 변수
		
		while (true) {
			// 메뉴 출력
			menu();
			System.out.print("메뉴 선택: ");
			menuInput = sc.nextInt();
			
			
			// 4를 입력하면 프로그램 종료
			if (menuInput == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 입력한 값에 따라 메뉴 실행
			switch (menuInput) {
			case 1:
				
				// 1-1 빙고판 크기 N 값 입력받기
				while (true) { // 3이상 9이하의 홀수만 입력 받기
					System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9이하 홀수): ");
					numN = sc.nextInt();
					
					// 제대로 된 값을 입력하면 탈출
					if (numN >= 3 && numN <= 9 && numN % 2 == 1) {
						break;
					}
					System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
				}
				
				// 1-2 난수 범위 입력 받기
				while (true) {
					// 조건 (endNum - startNum + 1) >= numN * numN
					System.out.print("난수 범위의 시작값을 입력하세요: ");
					startNum = sc.nextInt();
					System.out.print("난수 범위의 종료값을 입력하세요: ");
					endNum = sc.nextInt();
					
					// 조건에 부합하는 값을 입력했을 경우, 탈출
					if ((endNum - startNum + 1) >= numN * numN) {
						break;
					}
					System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
				}
				
				// 1-3 빙고 매트릭스 수 M 입력 받기
				while (true) {
					System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
					numM = sc.nextInt();
					
					// 제대로 된 값을 입력했을 경우, 탈출
					if (numM >= 1 && numM <= 7) {
						break;
					}
					System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
				}
				
				// 위 변수들을 사용하여 3차원 배열 생성
				int[][][] bingoBoard = new int[numM][numN][numN];
				bingoSize = numN * numN;
				int randNum = 0; // 난수 변수
				
				for (int i = 0; i < bingoSize;) {
					int[] randVector = new int[numN * numN]; // 난수 저장할 배열
					
				}
				
				
			
				
				
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
					
			}
		}
		
		
	}

}
