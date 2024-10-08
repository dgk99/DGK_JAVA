package lec240920.Drill240920;

public class ArithmeticOperator2 {
    public static void main(String[] args) {
        // 2. 나눗셈
        // a) 정수형 나눗셈 - 몫
        int x = 7;
        int y = 3;
        System.out.println("정수 나눗셈 (몫):");
        System.out.println("x / y = " + (x / y)); // 7 - 3 = 2

        // b) 실수형 나눗셈 - 몫
        double xDouble = 7.0;
        double yDouble = 3.0;
        System.out.println("xDouble / yDouble = " + (xDouble / yDouble));
        // 7.0 / 3.0 = 2.33333...

        // 2. 나머지 연산자
        // 나머지 연산자 동작 원리 설명
        System.out.println("나머지 연산자 (%): ");
        System.out.println("x % y = " + (x % y));
        System.out.println("나머지 연산자의 원리: x % y는 x를 y로 나누고 남은 나머지를 반환합니다.");
        System.out.println("따라서, 7을 3으로 나누면 몫은 2, 나머지는 1입니다.");
    }
}
