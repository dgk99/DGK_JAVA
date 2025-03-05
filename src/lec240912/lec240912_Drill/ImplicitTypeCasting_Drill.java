package lec240912_Drill;

public class ImplicitTypeCasting_Drill {
    public static void main(String[] args) {
        // 자동 형변환
        int num = 100;
        long bigNum = num; // 자동 형변환 (int -> long)
        double realNum = num; // 자동 형변환 (int -> double)

        System.out.println("long 값: " + bigNum); // 100
        System.out.println("double 값: " + realNum); // 100.0
    }
}
