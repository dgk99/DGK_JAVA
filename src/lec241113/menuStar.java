package lec241113;

import java.util.Scanner;

public class menuStar {

	public static void main(String[] args) {
		// 메뉴를 선택하세요
        // 1. M X N Matrix를 출력
        // 2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 4. 종료
        
        // 메뉴를 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력
		Scanner sc = new Scanner(System.in);
		int menuInput = 0;
		int userInputM = 0;
		int userInputN = 0;
		int count = 0;
		while (true) {
			System.out.println("====================");
			System.out.println("메뉴를 선택하세요 (게임 실행 횟수: " + count + ")");
			System.out.println("1. M X N Matrix를 출력");
			System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
			System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
			System.out.println("4. 종료");
			System.out.println("====================");
			
			// 사용자에게 메뉴판의 값 입력받기
			menuInput = sc.nextInt();
			
			while (true) {
				// 예외1) 입력값이 메뉴판에 없으면(5이상, 0이하면) 오류 출력 후 재입력. 메뉴판 있으면 안됨
				if (menuInput > 4 || menuInput <= 0) {
					System.out.println("잘못된 입력입니다. 다시 입력하세요");
					menuInput = sc.nextInt();
				} else {
					break;
				}
			}
			
			// 예외2) 입력값이 4이면, 프로그램 종료
			if (menuInput == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			// 입력값에 따라 매트릭스 출력
			switch (menuInput) {
				// 입력값이 1이면, M X N Matrix 출력
			case 1:
				while (true) {
					System.out.print("M 값을 입력하세요: ");
					userInputM = sc.nextInt();
					System.out.print("N 값을 입력하세요: ");
					userInputN = sc.nextInt();
					
					// 만약, 입력한 M,N 값이 0 또는 음수일 경우 오류 메시지 출력 및 재입력
					if (userInputM <= 0 || userInputN <= 0) {
						System.out.println("입력값이 0 또는 음수입니다. 다시 입력하세요");
						continue;
					} else {
						for (int m = 0; m < userInputM; m++) {
							for (int n = 0; n < userInputN; n++) {
								System.out.print("* ");
							}
							System.out.println();
						}
					}
					count++;
					break;
				}
				break;
				
				// 입력값이 2이면, 우하향 대각선의 별이 없는 Matrix 출력
			case 2:
				while (true) {
					System.out.print("M 값을 입력하세요: ");
					userInputM = sc.nextInt();
					System.out.print("N 값을 입력하세요: ");
					userInputN = sc.nextInt();
					
					// 만약, 입력한 M,N 값이 0 또는 음수일 경우 오류 메시지 출력 및 재입력
					if (userInputM <= 0 || userInputN <= 0) {
						System.out.println("입력값이 0 또는 음수입니다. 다시 입력하세요");
						continue;
					} else {
						for (int m = 0; m < userInputM; m++) {
							for (int n = 0; n < userInputN; n++) {
								if (m == n) {
									System.out.print("  ");
								} else {
									System.out.print("* ");
								}
							}
							System.out.println();
						}
					}
					count++;
					break;
				}
				break;
				
				// 입력값이 3이면, 양 대각선이 없는 Matrix 출력
			case 3:
				while (true) {
					System.out.print("M 값을 입력하세요: ");
					userInputM = sc.nextInt();
					System.out.print("N 값을 입력하세요: ");
					userInputN = sc.nextInt();
					
					// 만약, 입력한 M,N 값이 0 또는 음수일 경우 오류 메시지 출력 및 재입력
					if (userInputM <= 0 || userInputN <= 0) {
						System.out.println("입력값이 0 또는 음수입니다. 다시 입력하세요");
						continue;
					} else {
						for (int m = 0; m < userInputM; m++) {
							for (int n = 0; n < userInputN; n++) {
								if (m == n || m + n == userInputM - 1) {
									System.out.print("  ");
								} else {
									System.out.print("* ");
								}
							}
							System.out.println();
						}
					}
					count++;
					break;
				}
				break;
			}
			
		}
		

        // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //   * *
        //   * *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

//		int userInputM = 3;
//		int userInputN = 2;
//		
//		for (int m = 0; m < userInputM; m++) {
//			for (int n = 0; n < userInputN; n++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
        // 2번: 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     * *
        //   *   *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

//		int userInputM = 3;
//		int userInputN = 3;
//		
//		for (int m = 0; m < userInputM; m++) {
//			for (int n = 0; n < userInputN; n++) {
//				if (m == n) {
//					System.out.print("  ");
//				} else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}

        // 3번: 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 예) M : 3, N : 3
        //     *
        //   *   *
        //     *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
		
//		int userInputM = 3;
//		int userInputN = 3;
//		
//		for (int m = 0; m < userInputM; m++) {
//			for (int n = 0; n < userInputN; n++) {
//				if (m == n || m + n == userInputM - 1) {
//					System.out.print("  ");
//				} else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
	}

}
