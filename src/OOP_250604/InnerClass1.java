package OOP_250604;

interface Test { void print(); }

class Outer{
    int outer_val = 1;

    Test prt() {
        int local_val = 2;
        class Inner implements Test{
            public void print() {
                System.out.println(outer_val);
                System.out.println(local_val);
            }
        }

        return new Inner();
    }
}

public class InnerClass1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Test test = outer.prt();
        test.print();
    }
}
