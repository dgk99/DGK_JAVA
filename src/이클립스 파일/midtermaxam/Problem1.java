package midtermaxam;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 연산자 배열 생성
		// - 세 가지 연산자(+, -, *)를 포함하는 char type 1차원 배열을 생성
		char operator[] = {'*', '-', '+'};
		// 랜덤 생성된 값을 저장할 char type의 Array 생성
		char showOperator[] = {' ' , ' ', ' '};
		// 점수를 저장할 변수
		int bonus = 0;
		// 사용자의 값을 저장할 변수. 아무 값도 아닌게 아니면(뭐라도 입력하면)동작하도록 null을 넣음
		String userInput = null;
		// 처음 게임은 1번째부터 시작이니까 초기값을 1로 설정
		int gameCount = 1;
		
		while (true) {
			// 5. 게임 진행 안내
			// - 각 라운드의 시작 시 게임 라운드 번호를 표시하고, 사용자가 아무 값이나 입력하면 라운드를 시작합니다.
			System.out.println(gameCount + "번째 게임");
			System.out.print("게임을 시작하려면 아무 값이나 입력하세요");
			userInput = sc.nextLine();

			// 사용자가 아무 값이나 입력하면 게임 시작
			if (userInput != null) {
				// 2. 랜덤 연산자 선택
				// - 각 라운드에서 슬롯 머신을 돌리면 +,-,* 문자 중 3개가 무작위로 선택
				// - 선택된 3개의 연산자를 1차원 Array에 저장
				for (int value = 0; value < operator.length ; value++) {
					int comNum = (int)(Math.random() * 3);
					showOperator[value] = operator[comNum];
				}
				
				// 랜덤값으로 저장된 Array를 출력하는 구문
				System.out.println("------------------------");
				System.out.println("   " + showOperator[0] + "   :   " + showOperator[1] + "   :   " + showOperator[2] + "   ");
				System.out.println("------------------------");
				
				// 3. 콤보 점수 계산
				// - 슬롯머신에서 심볼이 연속해서 나오면 콤보 점수가 올라갑니다
				// - 2번 에서 저장된 배열 내에서 연속된 동일한 연산자의 개수를 계산하여, 아래 규칙에 따라 보너스 점수를 부여하세요.
				
				// b. 연속된 연산자가 세 개일 경우:
				// a. 연속된 연산자가 두 개일 경우:
				
				// + 연산자 : 3점 추가 (+ + +)
				if ((showOperator[0] == '+' &&  showOperator[1] == '+' && showOperator[2] == '+')) {
					System.out.println("+ 3 Combo - 보너스 점수 3점 획득");
					bonus += 3;
					// + 연산자 : 1점 추가 (+ + -)
				} else if ((showOperator[0] == '+' &&  showOperator[1] == '+') || (showOperator[1] == '+' &&  showOperator[2] == '+')) {
					System.out.println("+ 2 Combo - 보너스 점수 1점 획득");
					bonus++;
				}
					
				// - 연산자 : 3점 감점 (- - -)
				if ((showOperator[0] == '-' &&  showOperator[1] == '-' && showOperator[2] == '-')) {
					System.out.println("- 3 Combo - 보너스 점수 3점 감점");
					bonus -= 3;
					// - 연산자 : 1점 감점 (* - -)
				} else if ((showOperator[0] == '-' &&  showOperator[1] == '-') || (showOperator[1] == '-' &&  showOperator[2] == '-')) {
					System.out.println("- 2 Combo - 보너스 점수 1점 감점");
					bonus--;
				}   
					
				// * 연산자 : 5점 추가 (* * *)
				if ((showOperator[0] == '*' &&  showOperator[1] == '*' && showOperator[2] == '*')) {
					System.out.println("* 3 Combo - 보너스 점수 5점 획득");
					bonus += 5;
				} else if ((showOperator[0] == '*' &&  showOperator[1] == '*') || (showOperator[1] == '*' &&  showOperator[2] == '*')) {
					System.out.println("* 2 Combo - 보너스 점수 2점 획득");
					bonus += 2;
				} 
				
				// - 매 라운드가 끝나면 현재 점수를 출력합니다.
				System.out.println("현재 점수 : " + bonus);
				// 게임이 다 진행되었다는 의미로 게임 횟수 카운트 증가
				gameCount++;
				
				// 4. 게임 종료 조건
				// - 점수가 5점 이상이면 "승리", -5점 이하이면 "패배" 메시지를 출력하고 종료
				if (bonus >= 5) {
					System.out.println("승리! 최종 점수: " + bonus);
					break;
				} else if (bonus <= -5) {
					System.out.println("패배.. 최종 점수: " + bonus);
					break;
				}
			}
		}
	}
}
