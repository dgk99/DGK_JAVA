package lec241015;

public class SelectionIf {
    public static void main(String[] args) {

//        int bar = 3;
//
//         bar 2 이면 참을 출력 - 특정 조건
//         이 조건만 맞으면 되고, 나머지 조건은 무시 하면 된다
//
//         Python
//         if bar == 2:
//           print(bar)
//
//        if (bar == 2)System.out.println("bar");
//         둘의 차이점
//         조건식의 표현 방법이 틀림
//         Python은 :, java는 () 로 if문을 인식한다.
//         표현 방법만 틀릴 뿐이지 동작은 똑같다.

//        if (bar == 2)
//            System.out.println("bar");
        // c나 java는 기계를 우선으로 하는 언어이기에 들여쓰기가 필요 없다.

//        int bar = 3;
//        if (bar == 2)
//            System.out.println("bar");
//            System.out.println("foo");
        // result : foo

//        int bar = 3;if (bar == 2) System.out.println("bar");System.out.println("foo");
        // 왜 ;를 사용하는가?
        // 한 개의 명령어를 컴파일러가 구분하기 위해
        // Python에선 엔터키, java에선 ;

//        int bar = 3;
//        if (bar == 2) {
//            System.out.println("bar");
//        }
//        {
//            int foo = 5;
//            System.out.println("foo");
//        }
//        System.out.println(foo);

        int bar = 3;
        if (bar == 2) {
            System.out.println("Bar is 2");
        }
        // 특정 조건) bar가 2일 경우에만 동작. 나머지 조건은 무시
        if (bar == 2) {
            System.out.println("Bar is 2");
        } else {
            System.out.println("Bar is not 2");
        }
        if (bar % 2 == 0) {
            System.out.println("Bar is 2");
        } else if (bar % 2 != 0) {
            System.out.println("Bar is not 2");
        }
        // 모든 조건) bar가 2일때, 2가 아닐때를 모두 고려하여 동작.
    }
}
