package OOP_Study;

class Greeting {
    void printMsg() {
        System.out.println("안녕하세요");
    }
}

//class Greet extends Greeting {
//    @Override
//    void printMsg() {
//        System.out.println("Hello");
//    }
//}

class Greet extends Greeting {
    @Override
    void printMsg() {
        super.printMsg();
        System.out.println("봉쥬르");
    }
}

public class Overriding_250426 {
    public static void main(String[] args) {
    }
}
