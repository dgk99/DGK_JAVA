package Special;

import java.util.Scanner;

public class trialTest1208 {
    static void menu() {
        System.out.println("===== 빙고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 종료");
    }

    public static void main(String[] args) {

        // 빙고 생성 프로그램

        Scanner sc = new Scanner(System.in);
        int menuInput = 0; // 메뉴 입력 변수

        // 변수 목록
        int sizeN = 0; // 빙고판 크기 변수
        int startNum = 0, endNum = 0; // 난수 범위 변수
        int sizeM = 0; // 빙고 매트릭스 수 변수
        int[][][] bingoBoard = null; // 3차원 배열 생성


        // 메뉴 출력
        while (true) {
            menu();
            System.out.print("메뉴 선택: ");
            menuInput = sc.nextInt();

            // 4를 입력하면 프로그램 종료
            if (menuInput == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            // 입력 받은 값 대로 메뉴 실행
            switch (menuInput) {

                case 1:
                    // 1. 빙고판 생성
                    // 사용자에게 총 3개의 값을 입력 받음
                    while (true) {
                        // 1-1 빙고판 크기 N. 3이상 9이하의 홀수로 입력 받기
                        System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
                        sizeN = sc.nextInt();

                        // 잘못된 값을 입력하면, 재입력
                        if (sizeN >= 3 && sizeN <= 9 && sizeN % 2 == 1) {
                            break;
                        }
                        System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");

                    }

                    while (true) {
                        // 1-2 난수 범위. 시작 값과 종료 값 받기
                        System.out.print("난수 범위의 시작값을 입력하세요: ");
                        startNum = sc.nextInt();
                        System.out.print("난수 범위의 종료값을 입력하세요: ");
                        endNum = sc.nextInt();
                        // 조건 (종료값 - 시작값 + 1) >= N X N
                        // 이 조건을 만족하지 못하면 재입력 받기
                        if (endNum - startNum + 1 >= sizeN * sizeN) {
                            break;
                        }
                        System.out.println("종료 값 - 시작 값이 N X N 보다 크거나 같아야 합니다.");
                    }

                    while (true) {
                        // 1-3 빙고 매트릭스 수 M. 1이상 7이하의 정수로 입력받기
                        System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
                        sizeM = sc.nextInt();
                        // 잘못된 값을 입력하면, 재입력
                        if (sizeM >= 1 && sizeM <= 7) {
                            break;
                        }
                        System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
                    }

                    // 위 값을 이용해 3차원 배열 생성
                    bingoBoard = new int[sizeM][sizeN][sizeN];

                    int randNum = 0; // 난수 생성 변수
                    int bingoSize = sizeN * sizeN; // 빙고 크기


                    // 총 M번 반복
                    for (int m = 0; m < sizeM; m++) {
                        // 난수 생성
                        int[] randVector = new int[bingoSize]; // 난수 저장할 배열
                        for (int c = 0; c < bingoSize;) {
                            boolean overLapFlag = false;
                            randNum = (int)(Math.random() * (endNum - startNum + 1)) + startNum;

                            for (int r = 0; r < c; r++) {
                                if (randVector[r] == randNum){
                                    overLapFlag = true;
                                    break;
                                }
                            }
                            if (!overLapFlag) {
                                randVector[c] = randNum;
                                c++;
                            }
                        }
                        // 빙고판 생성
                        int v = 0;
                        for (int c = 0; c < sizeN; c++) {
                            for (int r = 0; r < sizeN; r++) {
                                bingoBoard[m][c][r] = randVector[v];
                                v++;
                            }
                        }
                    }

                    break;

                case 2:
                    // 2. 숫자별 발생 빈도 분석콤보 점수 계산
                    // - 생성된 모든 빙고판에서 각 숫자의 발생 횟수와 백분율을 출력합니다.
                    // - 10단위 스케일링 히스토그램으로 빈도를 시각화합니다
                    int[] numList = new int[endNum - startNum + 1];
                    for (int m = 0; m < sizeM; m++) {
                        for (int c = 0; c < sizeN; c++) {
                            for (int r = 0; r < sizeN; r++) {
                                int num = bingoBoard[m][c][r];
                                numList[num - startNum]++;
                            }
                        }
                    }
                    int num = startNum;
                    char star = '*';
                    for (int q = 0; q < numList.length; q++) {
                        System.out.print(num + ": " + numList[q] + "회 " + (numList[q] * 100.0 / (sizeM * sizeN * sizeN)) + "%" );
                        for (int i = 0; i < numList[q]; i++) {
                            System.out.print(star);
                        }
                        System.out.println();
                        num++;
                    }

                    break;

                case 3:
                    // 3. 빙고판 출력
                    for (int m = 0; m < sizeM; m++) {
                        System.out.println("빙고 매트릭스 #" + (m + 1));
                        for (int c = 0; c < sizeN; c++) {
                            for (int r = 0; r < sizeN; r++) {
                                System.out.print(bingoBoard[m][c][r] + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }

                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }
}
