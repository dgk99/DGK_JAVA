package test;


class Car{

    // 필드(멤버 변수): 객체의 속성
    String brand;
    int speed;

    // 생성자: 객체가 만들어질 때 실행되는 초기화 코드
    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    // 메서드(멤버 함수): 객체의 행동
    void accelerate(){
        speed += 5;
        System.out.println(brand + "속도 증가" + speed + "km/h");
    }

    void brake(){
        speed -= 5;
        System.out.println(brand + "속도 감소" + speed + "km/h");
    }


}

public class study {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai", 10);
        Car car2 = new Car("Mercedes", 20);

        car1.accelerate();
        car2.brake();
    }
}