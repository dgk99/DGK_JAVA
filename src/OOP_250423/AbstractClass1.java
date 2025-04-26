package OOP_250423;

abstract class Animal {
    abstract void makeSound();
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("wang wang wang wang");
    }
}

public class AbstractClass1 {
    public static void main(String[] args) {
        Animal a = new Dog(); // 다형성 적용
        a.makeSound();        // wang
        a.eat();              // eating...
    }
}
