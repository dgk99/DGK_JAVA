package OOP_250613;

interface MathOperator { // 함수형 인터페이스
    void operate(int a);
}


public class FunctionInterface1 {
    public static void main(String[] args) {

        MathOperator opAdd = a -> { System.out.println("hello"); };

    }
}
