package OOP_250507;

//class Pos {
//    void prt() {
//        System.out.println("pos");
//    }
//}
//
//class Kin {
//    void prt() {
//        System.out.println("kin");
//    }
//}
//
//class Test extends Pos, Kin {
//    void doSomething() {
//        prt();
//    }
//}

interface Car {
    void drive();
}
interface Airplane {
    void drive();
}
interface Pos extends Car, Airplane {

}
class Kin implements Pos {
    @Override
    public void drive() {
        System.out.println("Kin drive");
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {

    }
}
