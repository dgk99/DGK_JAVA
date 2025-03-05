package Special;

import java.util.Scanner;

public class exam6 {
    public static void main(String[] args) {
        // 사용자로부터 배열 크기 N을 입력받아,
        // 단, N이 0 또는 음수이면 재입력을 요구한다.

        Scanner sc = new Scanner(System.in);
        int numOfElements = 0;
        while (true) {
            System.out.print("배열 N의 크기를 입력하세요: ");
            numOfElements = sc.nextInt();

            // 탈출 조건 : if numOfElements > 0 => break
            if (numOfElements > 0 ) {
                break;
            }

            // 예외 출력
            System.out.println("양수 값을 입력하세요");
        }
        // N개의 정수를 저장할 수 있는 1차원 배열을 생성하라.
        int bar[] = new int[numOfElements];


        // 사용자로부터 난수 범위를 지정할 start, end 값을 입력받아,
        // start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장하라.
        // 단, (end - start + 1) 값이 배열의 크기 N보다 작을 경우
        // 다시 입력을 요구한다.
        // 예) N = 5 -> 5개의 원소를 가지는 1차원 배열 생성
        //     start = 10, end = 12 -> 배열 원소는 10, 11, 12 중 하나의 값이어야 함
        int start = 0;
        int end = 0;
        while (true) {
            System.out.print("시작 값을 입력하세요: ");
            start = sc.nextInt();
            System.out.println("끝 값을 입력하세요: ");
            end = sc.nextInt();

            if ((end - start + 1) >= numOfElements) {
                break;
            }
            System.out.println("배열의 크기보다 큰 범위를 입력하세요");
        }
        // 생성된 배열의 모든 원소 값을 출력하라.
        for(int i = 0; i < bar.length; i++) {
            bar[i] = (int)(Math.random() * (end - start + 1)) + start;
        }

        for(int value : bar) {
            System.out.println(value);
        }
    }
}
