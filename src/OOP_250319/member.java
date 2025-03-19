package OOP_250319;

class Bar{
    String msg;
    // 인스턴스 초기화 블록 : 객체가 생성될 때 초기화 작업을 실행
    // 생성자보다 먼저 실행
//    {
//        System.out.println("Oh my kamisama");
//    }

    // 클래스 초기화 블록: 클래스가 JVM에 로딩될 때 실행
    // 클래스 로더에 의해 메타 스페이스로 올라가는 것. 그때 딱 한번 실행됨.
    // 내가 이 클래스를 사용하지 않으면, 실행되지 않음.
    // 메인 메소드가 들어가있는 클래스만 실행되고 필요하면 추후에 로드함.
    static {
        System.out.println("Oh my kamisama");
    }
    Bar(String argMsg){
        msg = argMsg;
        System.out.println(msg);
    }
}

public class member {
    public static void main(String[] args) {
        Bar b1 = new Bar("hello");
        Bar b2 = new Bar("world");
    }
}
