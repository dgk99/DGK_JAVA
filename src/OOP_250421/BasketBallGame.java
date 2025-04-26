package OOP_250421;

class Player {
    protected String name;
    protected String position;

    Player(String argName, String argPosition) {
        this.name = argName;
        this.position = argPosition;
    }

    public void shoot() {
        System.out.println(position + " " + name + ": 기본 슛");
    }
}

class Sg extends Player {
    public Sg(String name) {
        super(name, "슈팅 가드");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 3점슛!");
    }
}

class Pg extends Player {
    public Pg(String name) {
        super(name, "포인트 가드");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 돌파 후 점프!");
    }
}

class Center extends Player {
    public Center(String name) {
        super(name, "센터");
    }
    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 골 밑 슛!");
    }
}

class Pf extends Player {
    public Pf(String name) {
        super(name, "파워 포워드");
    }

    @Override
    public void shoot() {

    }
}

public class BasketBallGame {
    public static void main(String[] args) {}
}
