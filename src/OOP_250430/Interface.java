package OOP_250430;

interface KL { public abstract void print(); }

class T {
    KL obj;
    T(KL obj) {
        this.obj = obj;
    }
    void print() {obj.print();}
}

class P implements KL { public void print() { System.out.println("P");}}
class Q implements KL { public void print() { System.out.println("Q");}}
class Z implements KL { public void print() { System.out.println("Z");}}


public class Interface {
    public static void main(String[] args) {
        (new T(new P())).print();
        (new T(new Q())).print();
        (new T(new Z())).print();
    }
}
