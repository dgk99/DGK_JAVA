package lec241015;

public class VariableLifecycle {
    public static void main(String[] args) {
        // 변수의 생명주기와 중괄호
        // 중괄호로 감싸진 블록이 시작되면, 해당 블록 내에서 선언된 변수들은
        // 블록이 끝날 때 까지 유효함

        int x = 10; // x는 main 메소드 전체에서 유효함
        {
            int y = 5; // y는 이 블록 내에서만 유효함
            System.out.println("x: " + x); // 가능함
            System.out.println("y: " + y); // 가능함
        }
        System.out.println("x: " + x); // 가능함
//        System.out.println("y: " + y); // 오류 발생 - y는 블록을 벗어나면 소멸됨
    }
}
