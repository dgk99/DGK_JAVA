package lec241114;

import java.util.Scanner;

public class menuStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 메뉴를 선택하세요
        // 1. M X N Matrix를 출력
        // 2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
        // 3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
        // 4. 종료
		Scanner sc = new Scanner(System.in);
		int menuInput = 0;
		int userInputM = 0;
		int userInputN = 0;
		int count = 0;
		while (true) {
			System.out.println("======================");
			System.out.println("메뉴를 선택하세요 (게임 실행 횟수: " + count + ")");
			System.out.println("1. M X N Matrix를 출력");
			System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
			System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
			System.out.println("4. 종료");
			System.out.println("======================");
			
			// 사용자에게 입력받기
			menuInput = sc.nextInt();
			while (true) {
				// 예외1) 메뉴판 외의 값을 입력했을 경우, 메뉴판 출력 없이 재입력
				if (menuInput > 4 || menuInput <= 0) {
					System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
					menuInput = sc.nextInt();
				} else {
					break;
				}
			}
			// 예외2) 사용자가 4번을 입력했다면, 프로그램 종료
			if (menuInput == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 예외 사항에 해당되지 않는다면, 입력받은 메뉴에 맞는 Matrix 출력하기
			
			switch (menuInput) {
			case 1:
				while (true) {
					System.out.print("M 값을 입력하세요: ");
					userInputM = sc.nextInt();
					System.out.print("N 값을 입력하세요: ");
					userInputN = sc.nextInt();
					
					// 만약, 사용자가 입력한 M,N값이 0 또는 음수이면 오류 출력 후 재입력 받기
					if (userInputM <= 0 || userInputN <= 0) {
						System.out.println("입력한 값이 0 또는 음수입니다. 다시 입력하세요");
					} else {
						for (int m = 0; m < userInputM; m++) {
							for (int n = 0; n < userInputN; n++) {
								System.out.print("* ");
							}
							System.out.println();
						}
						break;
					}
				}
				count++;
				break;
				
			case 2:
				while (true) {
					System.out.print("M 값을 입력하세요: ");
					userInputM = sc.nextInt();
					System.out.print("N 값을 입력하세요: ");
					userInputN = sc.nextInt();
					
					// 만약, 사용자가 입력한 M,N값이 0 또는 음수이면 오류 출력 후 재입력 받기
					if (userInputM <= 0 || userInputN <= 0) {
						System.out.println("입력한 값이 0 또는 음수입니다. 다시 입력하세요");
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
						count++;
						break;
					}
				}
				break;
				
			case 3:
				while (true) {
					System.out.print("M 값을 입력하세요: ");
					userInputM = sc.nextInt();
					System.out.print("N 값을 입력하세요: ");
					userInputN = sc.nextInt();
					
					// 만약, 사용자가 입력한 M,N값이 0 또는 음수이면 오류 출력 후 재입력 받기
					if (userInputM <= 0 || userInputN <= 0) {
						System.out.println("입력한 값이 0 또는 음수입니다. 다시 입력하세요");
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
					break;
				}
				count++;
				break;
			}
			
		}
        // 메뉴를 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력

        // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //   * *
        //   * *
        //   * *
        //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

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
