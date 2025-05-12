package OOP_250512;

// 예외 전파 흐름 확인용 클래스
class Bar {
    // level1 호출 -> 내부적으로 level2 호출
    void level1() {
        level2(); // 호출 스택: level1 -> level2
    }
    // level2 호출 -> 내부적으로 level3 호출
    void level2() {
        level3(); // 호출 스택: level2 -> level3
    }
    // level3에서 예외 발생
    void level3() {
        // RuntimeException은 Unchecked Exception
        // 예외를 처리하지 않고 그대로 던지므로 호출한 쪽으로 전달됨
//        throw new RuntimeException("예외 발생 위치: level3()");
        // throw 키워드는 정상 -> 비정상 모드로 전환.
        // 현재 발생한 예외가 어떤 예외인지 알려주기 위해
        // throw 우측에는 예외의 객체 값이 들어가야 한다.

        // 예외 클래스만 생성하면, 정상적으로 동작됨.
        new RuntimeException("예외 발생 위치: level3()");
        // 예외 클래스라고 해서 특별한 기능이 있는건 아님.

    }
}
// main 클래스
public class Exception1 {
    public static void main(String[] args) {
        // Bar 클래스의 level1()을 호출 -> 결국 level3()에서 예외 발생
        new Bar().level1();
        // 예외가 발생하면 아래 코드는 실행되지 않고 프로그램은 비정상 종료됨.
        System.out.println("이 코드는 실행되지 않습니다.");
    }
}
