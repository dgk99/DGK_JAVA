package OOP_Study;

class Parents {
    Parents() {
        System.out.println("부모가 먼저!");
    }
}

class Child extends Parents {
    Child() {
        System.out.println("자식은 나중에!");
    }
}

public class Inheritance_250426_2 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
