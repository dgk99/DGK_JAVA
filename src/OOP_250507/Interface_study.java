package OOP_250507;

interface Scan {
    // public abstract void doScan();
    void doScan();

    // public static final int scanNum = 2;
    int scanNum = 2;

    default void prePaper() {
        System.out.println("Prepaper");
    }

    static void prePower() {
        System.out.println("Power");
    }

}

class Equipment implements Scan {
    public void doScan() {
        System.out.println("Equipment scan");
        Scan.prePower();
    }

    @Override
    public void prePaper() {
        Scan.super.prePaper(); // 부모의 데이터를 불러 옴.
        System.out.println("Equipment- Prepaper");
    }
}

// implements는 특정 클래스에다가 특정 인터페이스들을 장착할 때 사용된다.
class Device implements Scan {
    int scanNum = 10;
    @Override // 오버라이딩의 조건 중 접근제어자가 같거나 더 커야하기 때문에
            // public을 붙여줘야 한다.
    public void doScan() {
        System.out.println(scanNum);
        System.out.println(Scan.scanNum);
        // 상수를 사용하기 위해선 인터페이스의 이름을 이용해 접근해야 한다.
    }
}

public class Interface_study {
    public static void main(String[] args) {
        Device d = new Device();
        d.doScan();
        Equipment e = new Equipment();
        e.prePaper();
    }
}
