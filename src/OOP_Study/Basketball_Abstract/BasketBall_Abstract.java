package OOP_Study.Basketball_Abstract;

abstract class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    // 모든 포지션에 공통적으로 필요한 메서드
    void introduce() {
        System.out.println("Hi, I'm " + name);
    }

    // 추상 메서드: 각 포지션마다 다르게 동작해야 함
    abstract void play(); // 반드시 자식이 구현해야 함
}

class PF extends Player {
    PF(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + "is boxing out as a Power Forward.");
    }
}

class C extends Player {
    C(String name) {
        super(name);
    }
    @Override
    void play() {
        System.out.println(name + "is defending the paint as a Center");
    }
}

class PG extends Player {
    PG(String name) {
        super(name);
    }
    @Override
    void play() {
        System.out.println(name + " is making assists as a Point Guard.");
    }
}

class SG extends Player {
    SG(String name) {
        super(name);
    }
    @Override
    void play() {
        System.out.println(name + " is shooting 3-pointers as a Shooting Guard.");
    }
}

class SF extends Player {
    SF(String name) {
        super(name);
    }
    @Override
    void play() {
        System.out.println(name + "is driving to the basket as a Small Forward.");
    }
}

public class BasketBall_Abstract {
    public static void main(String[] args) {
        Player[] team = {
                new PG("Chirs"),
                new SG("Ray"),
                new SF("Paul"),
                new PF("Kevin"),
                new C("Dwight")
        };

        for (Player p : team) {
            p.introduce();
            p.play();
            System.out.println();
        }
    }
}
