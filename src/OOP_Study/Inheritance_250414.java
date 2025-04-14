package OOP_Study;

class A {
    int a = 1;
    void prt () {
        System.out.println(a);
    }
}

class B extends A {
    int a = 2;
    void prt () {
        System.out.println(a);
    }
}

class C extends B {
    int a = 3;
    void prt () {
        System.out.println(a);
    }
}

public class Inheritance_250414 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.prt();
        b.prt();
        c.prt();
    }
}
