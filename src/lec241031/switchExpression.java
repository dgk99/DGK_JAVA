package lec241031;

import java.util.Scanner;

public class switchExpression {
    public static void main(String[] args) {

        // switch 문을 이용하여 아래 프로그램 작성
        // 키보드로부터 정수를 입력
//        int inputValue = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하세요: ");
//        int inputValue = sc.nextInt();

//        String selectedLang = "";
//
//        switch (inputValue) {
//            // 1이면 Python 출력
//            case 1:
//                selectedLang = "Python";
//                break;
//            // 2이면 Java 출력
//            case 2:
//                selectedLang = "Java";
//                break;
//            // 3이면 C++ 출력
//            case 3:
//                selectedLang = "C++";
//                break;
//            // 4이면 JavaScript 출력
//            case 4:
//                selectedLang = "JavaScript";
//                break;
//        }
//        System.out.println(selectedLang + "을 선택했습니다.");
        // 매번 break를 넣어야 해서 귀찮다!
        // switch를 쉽게 사용할 수 없을까? -> switch expression 도입!

        // 함수는 return값을 반환할 수 있다.
        // 여러개 중에 하나 선택하는건 기존과 동일. boolean만 추가되어 있음
        // 스위치문의 연산 결과 값을 return값으로 반환한다.
        // 반환 값이 필요할 때 사용.

//        String selectLang = switch(inputValue){
//            case 1, 5 -> "Python";
//            case 2 -> "Java";
//            case 3 -> "C++";
//            case 4 -> "JavaScript";
//            default -> "Wrong";
//        };
//        System.out.println(selectLang);

//        switch (inputValue) {
//            case 1 -> System.out.println("Python");
//            case 2 -> System.out.println("Java");
//            case 3 -> System.out.println("C++");
//            case 4 -> System.out.println("JavaScript");
//            default -> System.out.println("wrong");
//        }
//
//        String result = switch (inputValue) {
//            case 1 -> "Python";
//            case 2 -> "Java";
//            case 3 -> "C++";
//            case 4 -> "JavaScript";
//        };
//        System.out.println(result);

//        int bar[] = switch (inputValue) {
//            case 1 -> new int[5];
//            case 2 -> new int[2];
//            default -> null;
//        }
//        double bar[] = switch (inputValue) {
//            case 1 -> 4.0;
//            case 2 -> 3.4;
//            default -> 1.0;
//        }

        // 성적 [A, B, C], 출석 [PASS, FAIL]
        char grade = 'A';
        String attendance = "PASS";
        String allScholarship = "전액";
        String plusScholarship = "추가";
        String halfScholarship = "반액";


        String scholarship = switch(grade) {
            case 'A' -> {
                // 성적 A이고, 출석 PASS -> 전액 + 추가 장학금 출력
                if (attendance.equals("PASS")) {
                    yield allScholarship + plusScholarship + "장학금";
                } else { // 성적 A이고, 출석 FAIL -> 전액
                    yield allScholarship + "장학금";
                }
            }

            case 'B' -> {
                // 성적 B이고, 출석 PASS -> 반액
                if (attendance.equals("PASS")) {
                    yield halfScholarship + "장학금";
                } else {
                    yield "장학금 없음";
                }
            }

            case 'C' -> "장학금 없음";
            // 나머지는 장학금 없음
            default -> "Unknown";
        };




    }
}
