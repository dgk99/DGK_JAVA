package lec240920.Drill240920;

public class ArithmeticOperator1 {
    public static void main(String[] args) {
        // 기본 사칙연산
        int a = 10;
        int b = -5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // 음수화, 양수화 예제
        int positive = +a;
        int negative = -a;
        System.out.println(positive);
        System.out.println(negative);
    }
}
