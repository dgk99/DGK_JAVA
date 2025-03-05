package lec241205;

public class methodTest {
        // 2차원 배열을 출력하는 메서드
        public static void print2DArray(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) { // 행 반복
                for (int j = 0; j < matrix[i].length; j++) { // 열 반복
                    System.out.print(matrix[i][j] + " "); // 요소 출력
                }
                System.out.println(); // 줄 바꿈
            }
        }

        public static void main(String[] args) {
            int[][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; // 2차원 배열 생성
            print2DArray(data); // 메서드 호출
        }
    }


