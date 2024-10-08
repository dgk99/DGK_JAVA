package lec240920.Drill240920;

public class IncrementDecrementOperators1 {
    public static void main(String[] args) {
        // 전위 연산
        int a = 5;
        int b = ++a;

        System.out.println("a = " + a); // a는 6
        System.out.println("b = " + b); // b는 6

        // 후위 연산
        int c = 5;
        int d = c++; // c의 현재 값을 d에 대입한 후 c를 1 증가

        System.out.println("c = " + c); // c는 6
        System.out.println("d = " + d); // d는 5
    }
}
