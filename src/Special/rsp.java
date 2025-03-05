package Special;

import java.util.Scanner;

public class rsp {
    public static void main(String[] args) {
        // 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 입력 받기
        // - Scissors, Rock, Paper 중 하나를 입력 하세요:
        // 컴퓨터가 난수를 이용해서 가위-바위-보 중 하나 선택
        // 결과 출력
        // - 예1) 승리 : 사용자 - 가위, 컴퓨터 - 보
        // - 예2) 패배 : 사용자 - 가위, 컴퓨터 - 바위
        // - 예3) 무승부 : 사용자 - 가위, 컴퓨터 - 가위
        // 그리고 게임 재실행

        // 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
        // - Scissors, Rock, Paper 이외의 값이 입력 될 경우
        //   "잘못된 입력 값입니다, Scissors, Rock, Paper 중 하나를 입력하세요"
        // 출력 후 재입력
        // "quit"를 입력하면 프로그램 종료

        Scanner sc = new Scanner(System.in);

        // 승리 카운트
        int userCount = 0;
        int comCount = 0;

        // 무한루프
        while (true) {

            System.out.print("Scissors, Rock, Paper 중 하나를 입력 하세요: ");
            String userInput = sc.nextLine();

            // switch expression을 이용하여 scissors면 1, rock이면 2, paper이면 3, quit이면 4, 나머지면 5 등으로
            // 승패 계산이 쉬워 짐

            int inputValue = switch(userInput){
                case "s" -> 0;
                case "r" -> 1;
                case "p" -> 2;
                case "q" -> -1;
                default -> -2;
            };

            // 예외 처리
            // 1 : quit 이면 게임 프로그램 종료 -> break
            // 2 : 잘못된 입력 -> 재입력 -> continue
            // 결과 출력
            if (inputValue == -1) {
                System.out.println("프로그램 종료");
                break;
            } else if (inputValue == -2) {
                System.out.println("잘못된 입력");
                continue;
            }

            // 컴퓨터 선택 : 가위, 바위, 보 중 하나 선택
            // 난수 이용 : 0 ~ 2 사이 난 수 발생 후 "가위, 바위, 보"에 매칭
            String sciRockPaper[] = {"Scissors", "Rock", "Paper"};

            int computerInput = (int)(Math.random() * 3);

//            String comOutput = "";
//            if (computerInput == 0) {
//                comOutput = sciRockPaper[0];
//            } else if (computerInput == 1) {
//                comOutput = sciRockPaper[1];
//            } else {
//                comOutput = sciRockPaper[2];
//            }

            System.out.println("컴퓨터 결과: " + sciRockPaper[computerInput]);
            // 승패 계산 (컴퓨터의 결과도 표시)
            if (inputValue == computerInput) {
                System.out.println("무승부~ 다시!");
            } else if ((inputValue == 0 && computerInput == 1) || (inputValue == 1 && computerInput == 2) || (inputValue == 2 && computerInput == 0)) {
                System.out.println("사용자 패배...");
                comCount++;
            } else {
                System.out.println("사용자 승리!");
                userCount++;
            }
        }
        System.out.println("총 결과 " + "사용자 " +userCount + " : " + "컴퓨터 " + comCount);
    }
}
