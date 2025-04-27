package OOP_Study;

class Parent {
    String msg = "부모 메시지";
}

class Childs extends Parent {
    String msg = "자식 메시지";

    void printMsg() {
        System.out.println(msg);        // 자식 멤버
        System.out.println(this.msg);   // 자식 멤버
        System.out.println(super.msg);  // 부모 멤버
    }
}

public class Inheritance_250426_4 {
    public static void main(String[] args) {
        Childs c = new Childs();
        c.printMsg();
    }
}
