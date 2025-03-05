package lec241128;

public class matrixExampleDrill {
    public static void main(String[] args) {

        int[] bar = new int[] {10, 20, 30, 40, 50};
//        int[] bar = {10, 20, 30, 40, 50}; 위 아래 같음
        int[] foo = bar;

        foo[0] = 900;

        for (int i = 0; i < bar.length; i++) {
            System.out.print("barArray : " + bar[i]);
            System.out.println(" fooArray : " + foo[i]);
        }
    }
}
