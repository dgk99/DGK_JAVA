package lec240920.Drill240920;

public class IncrementDecrementOperators2 {
    public static void main(String[] args) {
        // 배열 초기화
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int index = 0;

        // 1. 후위 증감 연산자 활용 예; 배열 요소 탐색 (인덱스를 처리할 때)
        System.out.println("후위 증감 연산자 활용 예: ");

        // 배열을 순차적으로 탐색하면서 값을 출력
//        while (index < numbers.length) {
//            System.out.println("현재 요소 (후위)" + numbers[index++]);


        // index 초기화
//        index = 0;

        // 2. 전위 증감 연산자 활용 예: 특정 조건에 맞는 값만 증가
        System.out.println("\n전위 증감 연산자 활용 예:");
        // 조건에 맞을 때만 인덱스 값을 미리 증가시키고 나서 비교
        while (index < numbers.length) {
            if (++index == 4) {
                System.out.println("4번째 요소에 도달함 (전위):" + numbers[index - 1]); // numbers[3] 출력
                break;
            }
        }

        // 3. 증감 연산자와 반복문의 실제 활용 예
        System.out.println("\n증감 연산자와 반복문의 예:");
        for (int i = 0; i < numbers.length; ++i) { // 전위든 후위든 상관 없음
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
