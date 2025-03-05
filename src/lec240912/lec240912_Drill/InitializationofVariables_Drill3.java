package lec240912_Drill;

public class InitializationofVariables_Drill3 {

    // 클래스 내 멤버변수 암시적 초기화
    int num; // 기본 초기값 0 1 usage
    boolean flag; // 기본 초기값 false 1 usage
    String text; // 기본 초기값 null 1 usage

    public static void main(String[] args) {
        InitializationofVariables_Drill3 example = new InitializationofVariables_Drill3();

        // 기본 초기값 출력
        System.out.println("정수 초기값: " + example.num); // 0
        System.out.println("불리언 초기값: " + example.flag); // false
        System.out.println("문자열 초기값: " + example.text); // null
    }

}
