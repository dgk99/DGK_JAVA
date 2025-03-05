package Special;

import java.util.Scanner;

public class studentGradeCalculatorLab2 {
    // 메뉴 출력용 class
    static void studentMenu() {
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
    }

    // 입력된 학생 출력 class
    static void studentList(float[][] studentMatrix) {

        // 출력할 양식 리스트 생성
        String[] outputList = {"[학번: ", "] 국어: ", "영어: ", "수학: ", "합계: ", "평균: "};
        System.out.println("학생 목록: ");
        for (int i = 0; i < studentMatrix.length; i++) {
            //• 출력 형식: [학번] 국어: xx, 영어: xx, 수학: xx, 합계: xx, 평균: xx.xx
            if ((int) studentMatrix[i][0] > 0) {
                System.out.println("[학번: " + (int) studentMatrix[i][0] + "]"
                        + "국어: " + studentMatrix[i][1] + ", "
                        + "영어: " + studentMatrix[i][2] + ", "
                        + "수학: " + studentMatrix[i][3] + ", "
                        + "합계: " + studentMatrix[i][4] + ", "
                        + "평균: " + studentMatrix[i][5]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 2차원 배열 활용 학생 성적 계산기

//        0. 배열 만들기
//        • 학생 성적은 float 형 2차원 배열로 관리
//        • 2차원 배열의 초기 크기를 3행 6열로 설정
//         행: 학생 데이터의 저장 공간
//         열: [학번, 국어, 영어, 수학, 합계, 평균]
//        • 입력 값은 3행을 초과하지 않는다고 가정!^^

        // 배열을 위한 상수 지정
        final int STUDENTCOLUMN = 3;
        final int STUDENTROW = 6;

        // 3X6 Matrix 생성
        float studentGradeMatrix[][] = new float[STUDENTCOLUMN][STUDENTROW];

        Scanner scanner = new Scanner(System.in);

        int userMenuInput = 0; // 메뉴 입력
        int delStdId = 0; // 삭제할 학생 번호
        int studentCount = 0; // 저장된 학생 수

        // lab2 변수
        int newColumn = STUDENTCOLUMN; // 새 행의 길이를 위한 변수
        int studentNum = 0; // 학생 번호를 위한 변수
        char coverInput = '0';
        int overlapCheck = 0;

        while (true) {
            //        0-1 메뉴 출력
            while (true) {
                studentMenu();
                System.out.print("선택: ");
                userMenuInput = scanner.nextInt();
                if (userMenuInput >= 5 || userMenuInput < 1) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
                    continue;
                }
                break;
            }

            float sum = 0; // 국 영 수 더한 값
            float avg = 0; // 더한 값의 평균

            switch (userMenuInput) {
                case 1:
//        1. 학생 성적 입력
//        – 학번과 국어, 영어, 수학 성적을 차례대로 입력받음

                    // Lab2(1).행에 모든 학생이 등록되어 있는데 새로운 학생을 입력하려 한다면, 행의 크기를 2배로 늘려서 새 학생을 입력받는다
                    if (studentCount == studentGradeMatrix.length) {
                        // 1. 행 길이 두 배로 증가
                        newColumn *= 2;
                        // 2. 증가된 행의 길이를 가지는 새 Matrix 생성
                        float[][] newStudentGradeMatrix = new float[newColumn][STUDENTROW];
                        // 3. 기존의 값을 새 Matrix로 복사
                        for (int i = 0; i < studentCount; i++) {
                            for (int j = 0; j < STUDENTROW; j++) {
                                newStudentGradeMatrix[i][j] = studentGradeMatrix[i][j];
                            }
                        }
                        studentGradeMatrix = newStudentGradeMatrix;
                    }

                    // 입력받을 문구를 리스트 형태로 만듦
                    String[] gradeInputList = {"학번을 입력하세요: ", "국어 성적: ", "영어 성적: ", "수학 성적: "};

                    // (Lab2) 중복 학번을 검사하기 위해 학번을 따로 입력받음
                    System.out.print(gradeInputList[0]);
                    studentNum = scanner.nextInt();
                    studentGradeMatrix[studentCount][0] = studentNum;


                    // Lab2(2) 입력된 학번이 이미 존재하는 경우, 덮어쓰기 유무를 결정

                    boolean overlapFlag = false;

                    // 1. 입력한 학번이 중복인지 아닌지 먼저 검사.
                    for (int i = 0; i < studentCount; i++) {
                        // 2. 중복이 확인 되면, 덮어쓰기에 관한 입력 받기
                        if (studentNum == studentGradeMatrix[i][0]) {
                            System.out.println("중복된 입력이 있습니다.");
                            overlapCheck = i;
                            overlapFlag = true;
                        }
                    }

                    if (overlapFlag) {
                        System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기): ");
                        coverInput = scanner.next().charAt(0);
                        while (true) {
                            if (coverInput == 'q') {
                                System.out.println("메뉴로 돌아갑니다.");
                                break;
                            } else if (coverInput == 'Y') {
                                for (int i = 1; i < gradeInputList.length; i++) {
                                    System.out.print(gradeInputList[i]);
                                    studentGradeMatrix[overlapCheck][i] = scanner.nextFloat();
                                    sum += studentGradeMatrix[overlapCheck][i];
                                }
                                studentGradeMatrix[overlapCheck][4] = sum;
                                studentGradeMatrix[overlapCheck][5] = sum / 3.0f;
                                studentGradeMatrix[overlapCheck + 1][0] = 0;
                                break;
                            } else {
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                                coverInput = scanner.next().charAt(0);
                            }
                        }
                    } else {
                        for (int t = 1; t < gradeInputList.length; t++) {
                            System.out.print(gradeInputList[t]);
                            studentGradeMatrix[studentCount][t] = scanner.nextFloat();
                            // 국 영 수의 합만 더하면 되니 i가 1일 때 부터 sum에다가 값 3개를 더한다
                            sum += studentGradeMatrix[studentCount][t];

                        }
                        avg = sum / 3.0f;
                        System.out.println();
                        // index 4번(성적 합계), 5번(성적 평균)값을 입력
                        studentGradeMatrix[studentCount][4] = sum;
                        studentGradeMatrix[studentCount][5] = avg;

                        // 학생이 입력되었으니 학생 카운트 1 증가
                        studentCount++;
                        System.out.println("입력이 완료되었습니다.");
                    }

//        • 배열 필드: [학번, 국어, 영어, 수학, 합계, 평균]
//        – 합계와 평균을 계산하여 해당 필드에 저장
//        • 합계: 국어 + 영어 + 수학
//        • 평균: 합계 / 3
//        – 입력 완료 후 "입력이 완료되었습니다." 메시지를 출력하고 메뉴로 복귀
                    break;

                case 2:
//        2. 입력된 학생 목록 출력
//        – 현재 입력된 학생들의 성적 목록을 출력
                    if (studentCount == 0) {
                        // 데이터가 없는 경우 "입력된 학생 정보가 없습니다." 출력
                        System.out.println("입력된 학생 정보가 없습니다.");
                        break;
                    }

                    // 입력된 학생 정보가 저장된 list를 출력하는 함수 호출
                    studentList(studentGradeMatrix);

                    //– 출력 후 메뉴로 복귀.
                    break;


                case 3:
//        3. 학생 삭제하기
                    boolean flag = false;
                    while (true) {
//        – 현재 입력된 학생들의 목록을 출력
                        // 2번의 class를 출력
                        studentList(studentGradeMatrix);

                        System.out.print("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
                        delStdId = scanner.nextInt();

                        if (delStdId == -1) {
                            System.out.println("삭제 메뉴 종료");
                            break;
                        }

//        • 학번 존재 시: 해당 학생의 데이터를 삭제하고 "삭제가 완료되었습니다." 메시지 출력

                        int foundRowIndex = 0;
                        for (int i = 0; i < studentGradeMatrix.length; i++) {

                            if (studentGradeMatrix[i][0] == delStdId) {
                                foundRowIndex = i;
                                for (int p = 0; p < studentGradeMatrix[i].length; p++) {
                                    studentGradeMatrix[foundRowIndex][p] = 0;
                                }
                                System.out.println("삭제가 완료되었습니다.");
                                flag = true;
                            }
                        }
                        // 플래그가 true일 경우 == 위 while과 반대되는 경우(유저가 학번을 잘못 적은 경우)
                        if (!flag) {
                            System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                            continue;
                        }

//        – 삭제 완료 후 업데이트된 목록 출력
                        studentList(studentGradeMatrix);
                        break;
                    }


//        4. 종료
//        – 프로그램 종료
            }
            if (userMenuInput == 4) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
