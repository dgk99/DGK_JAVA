package Special;

import java.util.Scanner;

public class studentGradeCalculator {

    // 메뉴 출력
    static void menuPrt() {
        System.out.println();
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
    }


    public static void main(String[] args) {
        //• 학생 성적은 float 형 2차원 배열로 관리
        //• 2차원 배열의 초기 크기를 3행 6열로 설정
        final int STUDENTCOLUMN = 3;
        final int STUDENTROW = 6;
        // 행: 학생 데이터의 저장 공간
        // 열: [학번, 국어, 영어, 수학, 합계, 평균]
        // 학생 학번, 성적, 합계와 평균을 저장할 리스트 생성
        int[][] studentGradeMatrix = new int[STUDENTCOLUMN][STUDENTROW];
        //• 입력 값은 3행을 초과하지 않는다고 가정!^^

        Scanner sc = new Scanner(System.in);
        // 메뉴 입력 값
        int menuInput = 0;
        // 학생이 몇 명 저장되었나 확인하는 카운트
        int studentCount = 0;
        // count가 0이면 저장된 사람이 없고 0번 index부터 저장
        // count가 1이면 저장된 사람이 한 명. 그 다음 학생은 1번 index에 저장

        int sum = 0;
        int avg = 0;
        String[] outputList = {"[학번: ", "] 국어: ", ", 영어: ", ", 수학: ", ", 합계: ", ", 평균: "};
        String[] inputList = {"학번을 입력하세요: ", "국어 성적: ", "영어 성적: ", "수학 성적: "};

        int delStdId = 0;

        // 종료를 입력하기 전 까지 반복해야 하기에 while문 사용
        while (true) {
            // 메뉴 출력
            menuPrt();

            // 메뉴 입력 받기
            System.out.print("선택: ");
            menuInput = sc.nextInt();
            // switch를 입력한 메뉴마다 동작할 알고리즘 작성

            // 메뉴 입력 값이 4일 경우, 프로그램 종료
            if (menuInput == 4) {
                System.out.println("프로그램 종료");
                break;
            }


            switch (menuInput) {
                case 1:
                    //1. 학생 성적 입력
                    //– 학번과 국어, 영어, 수학 성적을 차례대로 입력받음
                    //– 입력된 데이터는 float형 2차원 배열에 저장
                    //• 배열 필드: [학번, 국어, 영어, 수학, 합계, 평균]
                    //– 합계와 평균을 계산하여 해당 필드에 저장
                    for (int i = 0; i < 4; i++) {
                        System.out.print(inputList[i]);
                        studentGradeMatrix[studentCount][i] = sc.nextInt();
                        if (i >= 1) {
                            sum += studentGradeMatrix[studentCount][i];
                        }
                    }
                    studentGradeMatrix[studentCount][4] = sum; //• 합계: 국어 + 영어 + 수학
                    avg = sum / 3;
                    studentGradeMatrix[studentCount][5] = avg; //• 평균: 합계 / 3
                    //– 입력 완료 후 "입력이 완료되었습니다." 메시지를 출력하고 메뉴로 복귀
                    System.out.println("입력이 완료되었습니다.");
                    studentCount++;
                    break;


                case 2:
                    //2. 입력된 학생 목록 출력
                    //– 현재 입력된 학생들의 성적 목록을 출력
                    System.out.println("학생 목록: ");
                    for (int i = 0; i < studentCount; i++) {
                        for (int j = 0; j < outputList.length; j++) {
                            if (j == 0) {
                                System.out.print(outputList[j] + studentGradeMatrix[i][j]);
                            } else {
                                System.out.print(outputList[j] + (float) studentGradeMatrix[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    //• 출력 형식: [학번] 국어: xx, 영어: xx, 수학: xx, 합계: xx, 평균: xx.xx
                    //– 데이터가 없는 경우 "입력된 학생 정보가 없습니다." 출력
                    if (studentCount == -1) {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    }
                    break;
                //– 출력 후 메뉴로 복귀.

                case 3:
//                3. 학생 삭제하기
//                – 현재 입력된 학생들의 목록을 출력
                    System.out.println("학생 목록: ");
                    for (int i = 0; i < studentCount; i++) {
                        for (int j = 0; j < outputList.length; j++) {
                            if (j == 0) {
                                System.out.print(outputList[j] + studentGradeMatrix[i][j]);
                            } else {
                                System.out.print(outputList[j] + (float) studentGradeMatrix[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    // 삭제할 학생의 학번이 존재, 미존재의 경우가 있기에 while로 받음
                    boolean flag = false;
                    while (!flag) {
//                – 삭제할 학생의 학번을 입력받음
                        System.out.print("삭제할 학생의 학번을 입력하세요: ");
                        delStdId = sc.nextInt();
//                – 사용자가 -1을 입력하면 삭제 메뉴 종료 후 전체 메뉴로 복귀
                        if (delStdId == -1) {
                            System.out.println("프로그램 종료");
                            break;
                        }
//                • 학번 존재 시: 해당 학생의 데이터를 삭제하고 "삭제가 완료되었습니다." 메시지 출력
                        for (int j = 0; j < studentGradeMatrix.length; j++) {
                            if (delStdId == studentGradeMatrix[j][0]) {
                                for (int k = 0; k < studentGradeMatrix[j].length; k++) {
                                    studentGradeMatrix[j][k] = 0;
                                }
                            }
                            flag = true;
                        }
//                – 삭제 완료 후 업데이트된 목록 출력
//                – 삭제 시 배열을 정리하여 빈 공간을 제거합니다.
//                • 학번 미존재 시: "해당 학번이 존재하지 않습니다. 다시 입력해주세요." 메시지 출력
                        if (!flag) {
                            System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                            continue;
                        }

                        System.out.println("학생 목록: ");
                        for (int i = 0; i < studentCount; i++) {
                            for (int j = 0; j < outputList.length; j++) {
                                if (j == 0) {
                                    System.out.print(outputList[j] + studentGradeMatrix[i][j]);
                                } else {
                                    System.out.print(outputList[j] + (float) studentGradeMatrix[i][j]);
                                }
                            }
                            System.out.println();
                            break;
                        }

                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
//            for (int value : studentGradeMatrix[0]) {
//                System.out.println(value);
//            }

        }
    }
}
