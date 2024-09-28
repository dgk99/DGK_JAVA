package lec240912_Drill;

public class InitializationofVariables_Drill4 {
    public static void main(String[] args) {
        // 지역변수 초기화 에러 예제
        int num; // 지역 변수 선언, 초기화되지 않음

        // System.out.println(num); // 컴파일 오류 발생: 변수 num이 초기화되지 않았음

        num = 10; // 초기화
        System.out.println("초기화된 값: " + num); // 출력: 10
    }
}
