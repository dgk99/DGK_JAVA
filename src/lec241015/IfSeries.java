package lec241015;

public class IfSeries {
    public static void main(String[] args) {

        int score = 80;

        if (score >= 80) {
            System.out.println("합격");
        }
        // 특정 조건. 조건이 맞으면 출력, 나머지 조건은 무시

        if (score >= 80) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        // 모든 조건. 조건에 맞든, 맞지 않든 모든 조건을 고려해야 함.
        // 둘 중에 하나 반드시 선택

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        }
        // 특정 조건. 조건문이 1개가 아닌 여러 개.

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        // 모든 + 특정 조건. 조건문이 1개가 아닌 여러개인데,
        // 그 조건문 중에서 무조건 1개는 선택해야 한다.
    }
}
