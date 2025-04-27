package OOP_Study;

// 추상 클래스 F : 두 개의 추상 메서드를 선언
abstract class F {
    abstract void method1(); // 추상 메서드 1
    abstract void method2(); // 추상 메서드 2
}
// 클래스 G: method1만 구현 -> 여전히 미완성 -> 추상 클래스
abstract class G extends F {
    @Override
    void method1() {
        System.out.println("method1 implemented in G");
    }
}
// 클래스 H: 나머지 method2를 구현 -> 드디어 완성 클래스!
abstract class H extends G {
    @Override
    void method2() {
        System.out.println("method2 implemented in H");
    }
}

//abstract class Food {
//    private abstract void Cook();
//}

public class AbstractClass_250426 {
    public static void main(String[] args) {

    }
}
