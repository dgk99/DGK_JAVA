package lec240912_Drill;

public class ExplicitTypeCasting_Drill {
    public static void main(String[] args) {
        double realNum = 9.99;
        int num = (int) realNum; // 강제 형변환 (double -> int)

        System.out.println("강제 형변환 후 int 값: " + num); // 9 (소수점 이하 버려짐)
    }
}
