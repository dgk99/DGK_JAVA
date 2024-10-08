package lec240920.Drill240920;

public class LogicalOperator1 {
    public static void main(String[] args) {
        // 예제: 주차 가능 여부
        // 조건: 주차장은 비어 있거나, 내가 가지고 있는 차량이 전기차여야 주차 가능
        // 주차장이 꽉 차 있더라도, 전기차는 주차 가능.

        boolean isParkingFull = false; // 주차장이 비어 있음
        boolean hasElectricCar = false; // 내 차는 전기차가 아님

        // 주차장이 비어있거나, 전기차일 경우 주차 가능
        boolean canPark = !isParkingFull || hasElectricCar;

        System.out.println("Can park: " + canPark);
        // 내 차는 전기차가 아니더라도, 주차장이 비어있기에 주차 가능
    }
}
