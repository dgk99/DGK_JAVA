package lec241015;

public class SingleIf {
    public static void main(String[] args) {
//        if ("조건식") {
        // "참"일때 실행되는 코드
//        }
        // if 조건식 결과가 True
        // currentHour가 9시 부터 18시 사이일 때만 알림을 출력
        // 업무 시간이 아니면 조건이 거짓이 되어, 알림이 표시되지 않음
//        int currentHour = 10; // 현재 시각 (24기간제)
//        if (currentHour >= 9 && currentHour <= 18) {
//            System.out.println("업무 시간 알림: 새로운 업무가 할당되었습니다.");

        // if 조건식 결과가 False
        // currentHour가 9시 부터 18시 사이가 아니므로 조건이 거짓이 되어 아무 것도 출력하지 않음
        // 업무 외 시간에는 불필요한 알림을 띄우지 않음
        int currentHour = 20; // 현재 시각 (업무 외 시간)
        if (currentHour >= 9 && currentHour <= 18) {
            System.out.println("업무 시간 알림: 새로운 업무가 할당되었습니다.");


        }
    }
}
