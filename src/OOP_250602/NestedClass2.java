package OOP_250602;

interface myInterface { void prt(); }

class Outer {
    int outer_val = 1;

    myInterface prtSomething() {
        class test implements myInterface {
            int local_val = 1;

            public void prt(){
                System.out.println(outer_val + local_val);
            }
        }

        return new test();
    }
}

public class NestedClass2 {
    public static void main(String[] args) {
        myInterface ifs = new Outer().prtSomething();
        ifs.prt();
    }
}
