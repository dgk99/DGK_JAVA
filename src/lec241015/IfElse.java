package lec241015;

public class IfElse {
    public static void main(String[] args) {
//        // if - else문
//        if (조건식) {
//            // "참"일때 실행되는 코드
//        } else {
//            // "거짓"일 때 실행되는 코드
//        }
        // 조건이 참일 경우, 거짓일 경우 모두 고려 해야 함
        // 둘 중에 무조건 1가지 선택

        // 로그인 성공/실패 시 알림 표시 - if 조건식 결과가 true
        // isLoggedIn이 참일 경우 "환영합니다!"를 출력하고,
        // 거짓일 경우 "로그인에 실패했습니다."를 출력
        // 로그인 성공 여부에 따라 환영 메시지 또는 오류 메시지를 표시함
        boolean isLoggedIn = true; // 로그인 성공 여부

        if (isLoggedIn) {
            System.out.println("환영합니다!");
        } else {
            System.out.println("로그인에 실패했습니다.");
        }

        // isLoggedIn이 거짓이므로 조건이 거짓일 때
        // else 블록이 실행되어 "로그인에 실패했습니다."가 출력됨
//        boolean isLoggedIn = false;
        if (isLoggedIn) {
            System.out.println("환영합니다!");
        }else {
            System.out.println("로그인에 실패했습니다.");
        }
    }
}
