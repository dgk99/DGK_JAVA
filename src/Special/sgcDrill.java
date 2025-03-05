package Special;

import java.util.Scanner;

public class sgcDrill {

    static void menu() {
        // 메뉴 만들기
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
    }

    public static void main(String[] args) {




        // Matrix 만들기
        // 2차원 배열의 초기 크기를 3행 6열로 고정. 상수로 지정
        final int COLUMN = 3;
        final int ROW = 6;

        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int menuInput = 0; // 메뉴 입력 변수

        // 선언한 상수로 3 X 6 Matrix 지정
        float[][] stdMatrix = new float[ROW][COLUMN];

        // 메뉴 선택 받기
        // 선택받은 메뉴에 따라 결과 값 출력
        // 잘못된 메뉴 입력 시 다시 입력 받기


        while (true) {
            menu();
            System.out.print("선택: ");
            menuInput = sc.nextInt();
            // 메뉴를 이상하게 입력할 시 재입력 받기
            if (menuInput > 4 || menuInput < 1) {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }

            // 메뉴 입력 값이 4면, 프로그램 종료
            if (menuInput == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            // 입력한 메뉴에 따라 결과 값 출력
            // switch를 이용해 각 메뉴에 따라 출력하기
            // 종료를 누르기 전 까지 계속 반복해야 하니 while문 안에 선언

            switch (menuInput) {
                case 1:
                    // 학생 성적 입력
                    
                    break;
                case 2:

                    break;
                case 3:

            }
        }







    }
}
