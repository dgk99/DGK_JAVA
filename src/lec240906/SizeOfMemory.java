package lec240906;

public class SizeOfMemory {

    byte bar = 127;
    short foo = 32767;
    int pos = 2147483647;
    long kn = 9223372036854775807L;
    double kin = 9223372036854775807L;

    boolean jos1 = true;
    boolean jos2 = false;

    public static void main(String[] args) {
        // for 문은 메소드 안에서 실행해야 함
        for (char value = 'A'; value <= 'Z'; value++) {
            System.out.println(value);
        }
    }
}
