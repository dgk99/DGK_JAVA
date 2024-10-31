package lec241029;

public class array {
    public static void main(String[] args) {
//        int bar[] = new int[3];
//
//        bar[0] = 100;
//        bar[1] = 200;
//        bar[2] = 300;
//
//        int foo[] = bar;
//
//        foo[2] = 500;
//
//        System.out.println(bar[2]);
//        System.out.println(foo);

//        char bar[] = new char[5];
//
//        bar[5] = 'a';

        int bar[] = {1, 2, 3, 4, 5};
//        int bar[] = new int[5];
//        for(int i = 0, j = 1; i < bar.length ; i++, j++) {
//            bar[i] = j;
//        }
        for(int value : bar) {
            System.out.println(value);
        }
    }
}
