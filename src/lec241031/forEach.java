package lec241031;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        // Happy Halloween
        Scanner sc = new Scanner(System.in);

        int num = 5;
        int bar[] = new int[num];
        // 반복 -> 배열의 원소를 처음부터 마지막까지
//        for (int i = 0; i < num; i++) {
        // 위 num의 값이 변경될 수 있으니 length를 사용하는 걸 추천
        for (int i = 0; i < bar.length; i++) {
            bar[i] = sc.nextInt();
        }

        // 배열 내 모든 원소를 출력하고 싶어...
//        for (int i = 0; i < bar.length; i++) {
//            // 실행코드 -> 각 iteration(각 반복마다 실행되는 코드)
//            System.out.println(bar[i]);
//        }
        for(int value : bar) {
            System.out.println(value);
        }
    }
}
