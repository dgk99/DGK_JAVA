package OOP_250305;

// 지금부터 클래스 정의하기~~~
class Car {
    // Data + Function
    // Data - Member variable (클래스 안에 속해있는 변수)
    String name;

    // Function -> Member method (멤버 메서드)
    void prtName() {
        System.out.println(name);
    }
}

public class OOP_Class {
    public static void main(String[] args) {

        int bar[] = new int[5];

        Car car1 = new Car();
        Car car2 = new Car();

        car2.name = "BMW";

        car2.prtName();

    }
}