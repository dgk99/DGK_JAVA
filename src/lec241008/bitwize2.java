package lec241008;

public class bitwize2 {
    public static void main(String[] args) {

//        //        0100 1010 1110 0010 0000 0000 1011 1011
//        int bar = 0b01001010111000100000000010111011;
//
//        // Get : 특정 자리의 비트 값 읽기
//        //       - 비트 자리 수
//        // ex) 30번째 자리의 값(1)이 참인지, 거짓인지 알고 싶을 때
//        // 어떻게 확인하면 될까?
//        int bitPosition = 30; // bit 범위는 31 ~ 0
//
//        // 1. 01000000000000000000000000000000으로 마스킹
//        int mask = 0b01000000000000000000000000000000;
//
//
////        int result = bar & mask;
////        System.out.println(result);
////        0100 0000 0000 0000 0000 0000 0000 0000
//
//
//        int resultInt = (bar & mask) != 0 ? 1 : 0; // 삼항 연산자
//        System.out.println(resultInt); // 1
//
//
//        // 2. 30번째 자리를 오른쪽으로 다 밀고, 마지막자리에서 마스킹
//        int smartMask = 1 << bitPosition;
//        // 0b000000000000000000000000000000001;
//        // 1 << 30;
//        // 0b01000000000000000000000000000000;
//        boolean result = (bar & smartMask) != 0;
//        System.out.println(result);    // true


        // Set : 특정 자리에 비트 값 쓰기
        //       - 비트 자리 수, 값

        //        0100 1010 1110 0010 0000 0000 1011 1011
        int bar = 0b01001010111000100000000010111011;
        int setPosition = 31;
        boolean value = true;
        // 31번째 값을 true로 바꾸고 싶을 때, 어떤 논리 게이트를 사용해야 할까?
        // |(OR)연산자

//        int mask = 1 << 31;
//        // 0b000000000000000000000000000000001;
//        // 1 << 31;
//        // 0b100000000000000000000000000000000;

        int mask = ~(1 << 31);
        // 0b000000000000000000000000000000001;
        // 1 << 31;
        // 0b100000000000000000000000000000000;
        // ~(1 << 31) 반전
        // 0b01111111111111111111111111111111;

        int result = bar & mask;
//        1100 1010 1110 0010 0000 0000 1011 1011

//        int result = bar | mask;
//        // 1100 1010 1110 0010 0000 0000 1011 1011



//        int bar = 0b00010001111001001001000000000000;
//        int mask = 0x00ff0000;
//        //     0000 0000 0000 0000 0000 0000 1111 1111
//        int foo = 0b11111111;
//        int kin = 255;
//
//        System.out.println(foo + " : " + mask + " : " + kin);
//
//        int result = bar & mask;
//        // 0000 0000 1110 0100 0000 0000 0000 0000
//        System.out.println(result);
//
//        // result = 255 : 255 : 255
    }
}
