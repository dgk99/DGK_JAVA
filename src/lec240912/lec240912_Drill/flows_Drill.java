package lec240912_Drill;

public class flows_Drill {
    public static void main(String[] args) {
        // Overflow example
        // int형 변수는 32비트 정수형으로, 값의 범위는 -2,147,483,648 ~ 2,147,483,647
        int maxInt = Integer.MAX_VALUE;; // int형 변수의 최댓값은 2,147,483,647

        // 최댓값에 1을 더하면 오버플로우 발생
        System.out.println("최댓값: " + maxInt);
        maxInt += 1; // 오버플로우 발생
        System.out.println("오버플로우 발생 후 값: " + maxInt);

        // int형 변수의 최솟값은 -2,147,483,648
        int minInt = Integer.MIN_VALUE;
        System.out.println("최솟값: " + minInt);

        // 최솟값에 1을 빼면 언더플로우 발생
        minInt -= 1; // 언더플로우 발생
        System.out.println("언더플로우 발생 후 값: " + minInt);
    }
}
