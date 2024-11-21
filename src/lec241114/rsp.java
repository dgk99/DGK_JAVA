package lec241114;

import java.util.Scanner;

public class rsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 중 하나 입력
        //  - 예시 : Scissors, Rock, Paper 중 하나를 입력 하세요:
        // 컴퓨터가 난수를 이용해, 가위-바위-보 중 하나 선택
		
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		String result = "";
		int bonus = 0;
		int stack = 0;
		while (true) {
			
			System.out.print("Scissors, Rock, Paper 중 하나를 입력 하세요: ");
			userInput = sc.nextLine();
			
			
			int inputValue = switch (userInput) {
			case "Scissors", "s" -> 0;
			case "Rock", "r" -> 1;
			case "Paper", "p" -> 2;
			case "Quit", "q" -> -1;
			default -> 4;
			};
			
			// 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
	        //  - Scissors, Rock, Paper 이외의 값이 입력 될 경우
	        //    "잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요"
	        //    출력 후 재입력
	        // "quit"를 입력하면 프로그램 종료
			if (inputValue == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			if (inputValue == 4) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				continue;
			}
			
			// 컴퓨터 난수 생성
			int comNum = (int)(Math.random() * 1);
			
			// 결과 출력
			//  - 예 3) 무승부 : 사용자 - 가위, 컴퓨터 가위
			if (inputValue == comNum) {
				result = "무승부";
				stack = 0;
			//  - 예 1) 승리 : 사용자 - 가위, 컴퓨터-보
			} else if ((inputValue == 0 && comNum == 2) || (inputValue == 1 && comNum == 0) || (inputValue == 2 && comNum == 1)) {
				result = "승리";
				stack++;
				if (stack >= 2) {
					bonus += 4;
				} else {
					bonus++;
				}
				
			} else { //  - 예 2) 패배 : 사용자 - 가위, 컴퓨터-바위
				result = "패배";
				stack = 0;
				bonus--;
			}
			
	        // 그리고 게임 재실행
			
			String rspArray[] = {"Scissors", "Rock", "Paper"};
			String resultSentence = " : 사용자 - " + userInput + ", 컴퓨터 - " + rspArray[comNum];
			System.out.println(result + resultSentence);
			System.out.println("현재 보너스 점수: " + bonus);
			
			if (bonus >= 7) {
				System.out.println("승리!");
				break;
			} else if (bonus <= -7) {
				System.out.println("패배...");
				break;
			}
		}

	}

}
