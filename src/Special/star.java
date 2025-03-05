package Special;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        // Step 1
        // 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        // * *
        // * *
        // * *
        // 예외처리 : M과 N이 0 또는 음의 정수일 경우, 재입력

        Scanner sc = new Scanner(System.in);

        int userInput1, userInput2;
        while (true) {
            // 사용자로부터 M과 N의 값을 입력받기
            System.out.print("행의 값을 입력하세요: ");
            userInput1 = sc.nextInt();
            System.out.print("열의 값을 입력하세요: ");
            userInput2 = sc.nextInt();

            // 사용자의 입력값이 음수이면 재입력받기
            if (userInput1 <= 0 || userInput2 <= 0) {
                System.out.println("입력값이 0 또는 음수입니다. 다시 입력하세요");
            } else {
                break;
            }
        }

        // M과 N의 값을 이용해 반복문을 사용하여 별 출력
        for (int m = 0; m < userInput1; m++) {
            for (int n = 0; n < userInput2; n++) {
                if (m == n) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }




        // Step 2
        // 문제는 동일, 출력값 변경 (왼쪽에서 오른쪽 대각선 값을 지우기)
        // 예) M : 3, N : 3
        //   * *
        // *   *
        // * *
    }
}
