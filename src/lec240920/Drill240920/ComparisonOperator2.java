package lec240920.Drill240920;

public class ComparisonOperator2 {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 = new String("Hello");
        String str2 = ("Hello");

        // 참조 비교: 서로 다른 객체이므로 false
        System.out.println(str1 == str2);
        // str1과 str2의 문자열에 대한 주소 값이 다르기 때문에 false이다

        // 내용 비교: 같은 문자열 내용을 가지고 있으므로 true
        System.out.println(str1.equals(str2));
    }
}
