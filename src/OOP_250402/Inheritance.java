package OOP_250402;

class Student{
    int id = 2;
    String name = "Student";
    int age = 30;
}

class GscStudent extends Student{
    int id = 20;
    String name = "GscStudent";
    GscStudent() {
        System.out.println("id" + this.id + ", name" + super.name + ", age" + age);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        GscStudent s = new GscStudent();

    }
}
