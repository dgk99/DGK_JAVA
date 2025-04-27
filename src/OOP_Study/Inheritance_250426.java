package OOP_Study;

// ✅ 가능한 경우
class A1 {
    int a = 1;

    A1() { // 기본 생성자 (매개변수 없음)
        System.out.println("A1 기본 생성자 호출: a = " + a);
    }
}

class A2 extends A1 {
    int a = 2;

    A2() {
        // super(); // 자동으로 호출됨 (문제 없음)
        System.out.println("A2 생성자 호출: a = " + a);
    }
}

// ❌ 불가능한 경우
class B1 {
    int b = 3;

    B1(int argB) { // 매개변수가 있는 생성자만 존재
        b = argB;
        System.out.println("B1 매개변수 생성자 호출: b = " + b);
    }
}

//class B2 extends B1 {
//    int b = 4;
//
//    B2() {
//        // super(); // 자동 추가되지만, B1에 기본 생성자가 없어서 에러 발생!
//        System.out.println("B2 생성자 호출: b = " + b);
//    }
//}

class B2 extends B1 {
    int b = 4;

    B2() {
        super(10); // 직접 정수 넘겨서 부모 생성자 호출
        System.out.println("B2 생성자 호출: b = " + b);
    }
}

public class Inheritance_250426 {
    public static void main(String[] args) {
        A2 a2 = new A2(); // 정상 작동
        // B2 b2 = new B2(); // 에러 발생! (주석 해제하면 컴파일 에러)
    }
}