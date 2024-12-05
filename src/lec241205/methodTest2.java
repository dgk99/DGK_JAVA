package lec241205;

public class methodTest2 {
        // 메서드에서 2차원 배열 생성 및 출력
        public static void createAndPrint2DArray() {
            // 2차원 배열 생성
            int[][] matrix = new int[3][3]; // 3x3 크기의 배열

            // 배열 초기화 (값을 채워넣음)
            int value = 1; // 초기값
            for (int i = 0; i < matrix.length; i++) { // 행 반복
                for (int j = 0; j < matrix[i].length; j++) { // 열 반복
                    matrix[i][j] = value++; // 값 설정
                }
            }

            // 배열 출력
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " "); // 요소 출력
                }
                System.out.println(); // 줄 바꿈
            }
        }

        public static void main(String[] args) {
            createAndPrint2DArray(); // 메서드 호출
        }
    }


