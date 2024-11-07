package Lab.lab241031;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        // switch문으로 요일 출력 프로그램
        // 1부터 7까지의 정수를 입력받아 해당 숫자에 맞는 요일을 출력하는 프로그램을 switch문을 이용해 작성하세요.
        // 단, 잘못된 숫자를 입력할 경우 "유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요."
        // 라는 메시지를 출력하고, 올바른 값을 입력할 대 까지 재입력을 받는다.
        // 또한, 토요일(6)과 일요일(7)은 "주말"로, 그 외 요일은 "주중"으로 구분하여 출력하시오
        Scanner sc = new Scanner(System.in);
        // 입력 값이 범위에 들어오나 안들어오나 검사
        int num;
        while (true) {
            System.out.print("1~7 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();
            if (num >= 8 || num <= 0) {
                System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요.");
            } else {
                break;
            }
        }

        String nomalDay = "주중";
        String weekend = "주말";

        // switch expression 사용
        String day = switch (num){
            case 1 -> "월요일" + nomalDay;
            case 2 -> "화요일" + nomalDay;
            case 3 -> "수요일" + nomalDay;
            case 4 -> "목요일" + nomalDay;
            case 5 -> "금요일" + nomalDay;
            case 6 -> "토요일" + weekend;
            case 7 -> "일요일" + weekend;
            default -> null;
        };
        System.out.println(day);


//        Scanner sc = new Scanner(System.in);
//        // 입력 값이 범위에 들어오나 안들어오나 검사
//        int num;
//        while (true) {
//            System.out.print("1~7 사이의 숫자를 입력하세요: ");
//            num = sc.nextInt();
//            if (num >= 8 || num <= 0) {
//                System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요.");
//            } else {
//                break;
//            }
//        }
//
//        String weekend = "주말";
//        String date = "주중"
//        String day = "";
//
//        switch (num) {
//            case 1:
//                day = "월요일" + date;
//                break;
//            case 2:
//                day = "화요일";
//                weekend = "주중";
//                break;
//            case 3:
//                day = "수요일";
//                weekend = "주중";
//                break;
//            case 4:
//                day = "목요일";
//                weekend = "주중";
//                break;
//            case 5:
//                day = "금요일";
//                weekend = "주중";
//                break;
//            case 6:
//                day = "토요일";
//                weekend = "주말";
//                break;
//            case 7:
//                day = "일요일";
//                weekend = "주말";
//                break;
//        }
//        System.out.println(day + ", " + weekend);
    }
}
