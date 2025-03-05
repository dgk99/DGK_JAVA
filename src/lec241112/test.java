package lec241112;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
        // Step 1
        // 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        // * *
        // * *
        // * *
        // 예외처리 : M과 N이 0 또는 음의 정수일 경우, 재입력
		
		
		Scanner sc = new Scanner(System.in);
		
		int userInput1, userInput2 = 0;
		
		while (true) {
			System.out.print("첫 번째 양의 정수를 입력하세요: ");
			// 사용자로부터 정수 입력 받기
			userInput1 = sc.nextInt();
			System.out.print("두 번째 양의 정수를 입력하세요: ");
			userInput2 = sc.nextInt();
			
			// 만약, 사용자가 입력한 정수가 음수 또는 0이면, 오류 문구 출력 후 재입력 받기
			if (userInput1 <= 0 || userInput2 <= 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			} else {
				break;
			}
		}
		
		// 입력받은 정수를 토대로, 별을 출력하기
		for (int m = 0; m < userInput1 ; m++) {
			for (int n = 0; n < userInput2; n++) {
				if (m == n) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
				
			}
			System.out.println(" ");
		}
	}
}
