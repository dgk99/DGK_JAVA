package lec241015;

public class CurlyBrace {
    public static void main(String[] args) {
        // {} 중괄호는 코드를 블록으로 그룹화 하는 기호
        // 특정 조건이 참일 때 실행할 여러 줄의 코드를 하나의 블록으로 묶는 역할
        // 중괄호 사용 방법
        {
            // Code Block
        }
        if (true) {
            System.out.println('1');
        System.out.println('2');
        } else {
            System.out.println('4');
            System.out.println('5');
        }
        // 출력 결과 : 1, 2
        // if문에선 1은 당연히 if문 안에 있고, 2는 들여쓰기 때문에 햇갈릴 수 있으나 if의 {}안에 있어 if가 참이면 같이 동작함
        // 반면 4와 5는 else문 안에 그룹화 되어 있어 if가 참이면, else는 출력 되지 않음

        // 중괄호를 쓰는 이유
//        int age = 18;
//        if (age >= 18) {
//            System.out.println("성인입니다.");
//            System.out.println("입장 가능합니다.");
//        }
        // age는 18이니 조건문이 참이므로 두 문장이 다 출력됨

        int age = 18;
        if (age >= 18)
            System.out.println("성인입니다.");
            System.out.println("입장 가능합니다.");
        // 중괄호를 사용하지 않으면 if문 다음 문장만 if문의 영향을 받아
        // 성인입니다 부분만 조건문의 참/거짓에 따라 출력된다.
        // 하지만 입장 가능합니다는 if문에 속해 있지 않기에
        // 언제든 출력되는 문장이다.
    }
}
