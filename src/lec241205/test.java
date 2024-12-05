package lec241205;

public class test {


        public static void printArray(int[] numbers) {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println(); // 줄 바꿈
        }

        public static void main(String[] args) {
            int[] data = {1, 2, 3, 4, 5}; // 입력 배열
            printArray(data); // 메서드 호출
        }
    }


