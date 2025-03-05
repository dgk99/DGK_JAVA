package lec241113;

import java.util.Scanner;

public class rsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 입력 받기
        // - Scissors, Rock, Paper 중 하나를 입력 하세요:
		Scanner sc = new Scanner(System.in);
		int userValue = 0;
		String userInput = "";
		while (true) {
			System.out.print("Scissors, Rock, Paper 중 하나를 입력 하세요: ");
			userInput = sc.nextLine();
			
			// 가위, 바위, 보, 종료 를 입력했을 시, 숫자로 치환해서 계산하도록 switch expression을 사용하기
			userValue = switch (userInput) {
			case "Scissors", "s" -> 0;
			case "Rock", "r" -> 1;
			case "Paper", "p" -> 2;
			case "Quit", "q" -> -1;
			default -> -2;
			};
			
			// 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
	        // - Scissors, Rock, Paper 이외의 값이 입력 될 경우
	        //   "잘못된 입력 값입니다, Scissors, Rock, Paper 중 하나를 입력하세요" 출력 후 재입력
			if (userValue == -2) {
				System.out.println("잘못된 입력 값입니다, Scissors, Rock, Paper 중 하나를 입력하세요");
			}
	        // "quit"를 입력하면 프로그램 종료
			if (userValue == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 컴퓨터가 난수를 이용해서 가위-바위-보 중 하나 선택
			int comNum = (int)(Math.random() * 3);
			
			String result = "";
	        // 결과 출력
			// - 예3) 무승부 : 사용자 - 가위, 컴퓨터 - 가위
			if (userValue == comNum) {
				result = "무승부";
				// - 예1) 승리 : 사용자 - 가위, 컴퓨터 - 보
			} else if ((userValue == 0 && comNum == 2) || (userValue == 1 && comNum == 0) || (userValue == 2 && comNum == 1)) {
				result = "승리";
			} else { // - 예2) 패배 : 사용자 - 가위, 컴퓨터 - 바위
				result = "패배";
			}

	        // 그리고 게임 재실행

			String rspArray[] = {"Scissors", "Rock", "Paper"};
	        String resultSentence = " : 사용자 - " + userInput + ", 컴퓨터 - " + rspArray[comNum];
	        
	        System.out.println(result + resultSentence);
		}
		
        
        
	}

}
