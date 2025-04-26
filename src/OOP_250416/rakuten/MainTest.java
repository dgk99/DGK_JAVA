package OOP_250416.rakuten;

import OOP_250416.gsc.GscStudent;

class YjuStudent extends GscStudent {
    void toSomething() {
        int temp = x;
    }
}

public class MainTest {
    public static void main(String[] args) {
        GscStudent userInfo = new GscStudent();
        System.out.println(userInfo);
    }
}
