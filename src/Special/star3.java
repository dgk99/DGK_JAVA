package Special;

import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {

        // 행 값만 입력받는데, 행이 짝수이면 다시 입력받기

        Scanner sc = new Scanner(System.in);

        int userInput = 0;

        while (true) {
            System.out.print("값을 입력하세요: ");
            userInput = sc.nextInt();

            if (userInput % 2 == 0) {
                System.out.println("값이 짝수입니다. 홀수만 입력하세요.");
            } else {
                break;
            }
        }

        // 입력받은 행을 토대로 삼각형 모양의 별 만들기
//        double num = (userInput / 2 + 0.5);
        for (int m = 0, p = userInput / 2; m <= p; m++) {
            for (int n = 0; n <= p; n++) {
                if (m < n) {
                    System.out.print("a ");
                }  else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        int num = userInput / 2;
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < num + 1; j++) {
                if (i > j) {
                    System.out.print("* ");
                } else {
                    System.out.print("a ");
                }
            }
            System.out.println();
        }
    }
}
// && n * m != userInput - p
