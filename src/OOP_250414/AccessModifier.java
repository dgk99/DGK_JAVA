package OOP_250414;

class Bar {
    private int x;
    void prt() {
        System.out.println(x);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Bar b = new Bar();
//        System.out.println(b.x); // 멤버변수
    }
}
