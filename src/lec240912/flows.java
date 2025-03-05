package lec240912;

public class flows {
    public static void main(String[] args) {

        // byte -> 1 byte -> 8bits -> 2^8
        // -> 256 -> -128 ~ 127
        // 최대값 : 127
        // 최소값 : -128
//        byte bar = 128; // overflow
//        bar = -129; // underflow

        byte bar = 127; // overflow
        bar++; // bar = bar + 1
        System.out.println(bar); // result -> -128

        bar = -128; // underflow
        bar--; // bar = bar - 1
        System.out.println(bar); // result -> 127


        long pos = 2147483647L + 2;
        System.out.println(pos);

//        long pos = (long)(2147483647 + 2);
//        System.out.println(pos);

//        long kin = (450 + 3) / 2.0;
//        System.out.println(kin);

    }
}
