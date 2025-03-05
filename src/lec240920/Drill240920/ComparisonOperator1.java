package lec240920.Drill240920;

public class ComparisonOperator1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 1. 같다 (==)
        System.out.println(a == b); // false

        // 2. 같지 않다 (!=)
        System.out.println(a != b); // true

        // 3. 크다(>)
        System.out.println(a > b); // false

        // 4. 작다(<)
        System.out.println(a < b); // true

        // 5. 크거나 같다(>=)
        System.out.println(a >= b); // false

        // 6. 작거나 같다(<=)
        System.out.println(a <= b); // true

        // 7. 조건문에서 비교 연산자 사용
        if (a < b) {
            System.out.println("a는 b보다 작습니다");
        } else {
            System.out.println("a는 b보다 크거나 같습니다");
        }
    }
}
