package lec240920;

public class shorttest {
    public static void main(String[] args) {

//        int bar = 1;
//
//        int foo = ++bar; // foo = (bar = bar + 1)
//        System.out.println(foo);
//
//        int kin = bar++; // kin = bar -> bar = bar + 1
//        System.out.println(kin);
//
//        byte kar = 1;
//
//        //kar++;
//
//        kar = kar + 1;

//        int pos = 3;
//
//        boolean result = 1 < pos && pos < 10;
//
//        System.out.println(result); // true
//        System.out.println(!result); // false

        int bar = 1;

        if ( 2 > 3 || (bar += 1) > 4){
            System.out.println(bar);
        }
        System.out.println(bar);
    }
}
