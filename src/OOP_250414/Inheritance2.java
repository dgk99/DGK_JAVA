package OOP_250414;

class Student {
    String name = "홍길동";
    int age = 20;

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("name: " + std.name + ", age: " + std.age);
        System.out.println(std);
    }
}
