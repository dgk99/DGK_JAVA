package Lab.lab241031;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        //• 학생의 성적 등급과 출석 등급을 입력받아 장학금 지급 여부와 권장 사항 판별하는 프로그램을 작성하시오
        //• switch expression과 yield를 사용하여 구현하시오
        //• 성적 등급과 출석 등급에 따라 다음과 같은 규칙으로 장학금 지급 여부와 권장 사항을 결정한다
        //– 성적 등급이 A이고 출석 등급이 Excellent인 경우: ＂전액 장학금 및 추가 지원금 지급 “
        //– 성적 등급이 A이고 출석 등급이 Average인 경우: ＂전액 장학금“
        //– 성적 등급이 B이고 출석 등급이 Excellent인 경우: "반액 장학금“
        //– 성적 등급이 C, D인 경우
        //• 출석 등급이 Poor인 경우: "장학금 없음, 재수강 권장“
        //• 출석 등급이 Excellent 또는 Average인 경우: "장학금 없음“
        //– 성적 등급이 F인 경우: "장학금 없음, 재수강 권장“
        //– 이외 경우는 “장학금 없음”으로 출력
        //– 잘못된 성적 등급 또는 출석 등급이 입력된 경우: "잘못된 입력입니다“
        //• 성적 등급은 A, B, C, D, F 중 하나로 입력받고, 출석 등급은 Excellent, Average, Poor 중 하나로 입력받는다
        //• 키보드로부터 입력받은 영문자는 모두 대문자로 변환하여 처리한다 (예: poor → POOR). 직접 구현 할 것
        //• 재입력 기능을 구현하여 잘못된 입력이 있을 경우 다시 입력받도록 한다

        Scanner sc = new Scanner(System.in);

        String allScholarship = "전액 장학금";
        String plusScholarship = "추가 지원금";
        String halfScholarship = "반액 장학금";
        String noScholarship = "장학금 없음";
        String oneMoreYear = "재수강 권장";

        char grade;
        String attendance;

        while (true) {
            System.out.println("학생의 성적 등급을 입력하세요 (A, B, C, D, F): ");
            grade = 'A';
            System.out.println("학생의 출석 등급을 입력하세요 (Excellent, Average, Poor): ");
            attendance = "Excellent";

            if ((grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') && (attendance == "Excellent" || attendance == "Average" || attendance == "Poor")) {
                String value = switch (grade) {
                    case 'A' -> {
                        if (attendance.equals("Excellent")) {
                            yield allScholarship + " 및 " + plusScholarship + " 지급";
                        } else if (attendance.equals("Average")) {
                            yield allScholarship;
                        } else {
                            yield noScholarship;
                        }
                    }
                    case 'B' -> {
                        if (attendance.equals("Excellent")) {
                            yield halfScholarship;
                        } else {
                            yield noScholarship;
                        }
                    }
                    case 'C', 'D' -> {
                        if (attendance.equals("Poor")) {
                            yield noScholarship + ", " + oneMoreYear;
                        } else {
                            yield noScholarship;
                        }
                    }
                    case 'F' -> {
                        yield noScholarship + ", " + oneMoreYear;
                    }
                    default -> null;
                };
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }
}
