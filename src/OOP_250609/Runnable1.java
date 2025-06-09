package OOP_250609;

interface Test {
    void print();
}
public class Runnable1 {
    public static void main(String[] args) {
        Test test = new Test(){
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        };

        test.print();
    }
}
