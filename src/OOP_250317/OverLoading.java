package OOP_250317;

// OverLoading
// 적용 -> [OOP: 메서드, 생성자], [구조적 언어: 함수]
// Key Point : 함수, 메서드, 생성자에서 동일한 이름을 가지는 sub-routine이 존재

class Bar {
    void prtSomething() {}
    void prtSomething(int x) {}
    void prtSomething(String x) {}
    void prtSomething(int x, int y) {}
}

class Enemy {
//    int id; // instance member variable
    static int id = 100; // class member variable
    Enemy(){
        System.out.println(++id);
    }
}

public class OverLoading {
    public static void main(String[] args) {
//        Enemy e1 = new Enemy();
//        Enemy e2 = new Enemy();
//        Enemy e3 = new Enemy();
//        Enemy e4 = new Enemy();
        System.out.println(Enemy.id);
    }
}
