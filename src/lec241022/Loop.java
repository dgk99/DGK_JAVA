package lec241022;

public class Loop {
    public static void main(String[] args) {

//        int bar = 0;
//        for(int bar = 0 ; bar < 2 ; bar++ ) {
//            // 실행 문장
//            System.out.println("Hello World");
//            bar++;
//        }
//        int foo = 0;
//        while(foo < 2){
//            System.out.println("Hello World");
//            foo++;
//        }

//        for (int bar = 0, pos = 2 ; bar < 5; bar++, pos--){
//            System.out.println(pos);
//

//        for (int i = 0; i < 10; i ++) {
//            System.out.println(i);
//        }
//
//        int i = 20;

//        // *을 10개 출력하세요
//        // **********
//        for (int star = 0; star < 10; star++) {
//            System.out.print('*');
//        }
//        // 1~10 사이 정수 중 짝수를 출력하세요
//        for (int num = 0; num <= 10; num++) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }
//        for (int num2 = 2; num2 <= 10; num2 += 2) {
//            System.out.println(num2);
//        }
        // Z ~ A 를 출력하시오
//      for (char chValue = 'Z'; chValue >= 'A'; chValue -= 2)
//        for (char chValue = 'Z'; chValue >= 'A'; chValue--) {
//            // Z ~ A 까지 한개 씩 건너서 출력
//            if (chValue % 2 == 0) {
//                System.out.print(chValue);
//            }
//        }
        // 1차원 배열(Array) 선언 -> 원소의 개수 5개
        int bar[] = new int[5];
        // bar 배열의 각 원소의 값을 초기화
        for(int iCount = 0, value = 1 ; iCount < bar.length; iCount++, value *= 10) {
            bar[iCount] = value;
        }
        // bar 배열의 각 원소의 값을 출력
        for (int iCount = 0 ; iCount < bar.length; iCount++) {
            System.out.println(bar[iCount]);
        }
    }
}
