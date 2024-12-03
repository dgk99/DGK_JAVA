package lec241203;

public class methodDrill {

    public static int[] findMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int[] result = new int[2]; // 1차원 배열 생성
        result[0] = min; // 최소값 저장
        result[1] = max; // 최대값 저장

        return result; // 배열 반환
    }

    public static void main(String[] args) {
        int[] data = {3, 5, 7, 2, 8}; // 입력 배열
        int[] minMax = findMinMax(data); // 메서드 호출

        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);
    }
}
