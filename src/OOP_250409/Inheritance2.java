package OOP_250409;


class A {
    void prt() { System.out.println("안녕하세요"); }
}

class B extends A {
    @Override
    void prt() {
        super.prt();
        System.out.println("Hello");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        new B().prt();
    }
}
