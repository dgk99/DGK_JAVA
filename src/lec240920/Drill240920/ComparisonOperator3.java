package lec240920.Drill240920;

public class ComparisonOperator3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        // 참조 비교: 서로 같은 객체
        System.out.println(str1 == str2);
        // jvm, 컴파일러가 똑똑해서 리터럴 상수로 문자열을 생성하고
        // 다른 변수도 그 문자열을 사용하면
        // 같은 데이터 주소 값을 가지게 해서 true가 나온다
    }
}
