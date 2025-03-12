package OOP_250312;

class Bar {
    void prtMsg(String argMsg1) {
        System.out.println(1);
    }
    void prtMsg(int argMsg1, String argMsg2) {
        System.out.println(2);
    }
    void prtMsg(String argMsg1, int argMsg2) {
        System.out.println(3);
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.prtMsg(3000, "yo");
        bar.prtMsg("ay");
        bar.prtMsg("finally", 1004);
    }
}
