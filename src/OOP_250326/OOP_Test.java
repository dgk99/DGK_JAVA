package OOP_250326;

class Foo {
    int x;
    Foo (int argX) { x = argX; }
}

class Pos {
    void prtShow(Foo argFoo) {
        System.out.println(argFoo.x);
    }
}

public class OOP_Test {
    public static void main(String[] args) {

        Foo f1 = new Foo(2);
        Pos p1 = new Pos();
        p1.prtShow(f1);
        (new Pos()).prtShow(new Foo(1));

    }
}
