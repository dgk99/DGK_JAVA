package lec241121;

public class array5 {
    public static void main(String[] args) {
//        char bar[] = {"a", "b"};
//        String foo[] = {'a', 'b'};

        double foo[] = new double[10];
        char kin[] = new char[10];
        boolean pos[] = new boolean[10];

        int bar[] = new int[10];
        // bar에 값을 지정하려면,
        bar[0] = 1;
        bar[1] = 2; //...등으로 일일이 지정하거나
        for(int i = 0; i < bar.length; i++) {
            // 반복문으로 지정하는 방법이 있다.
        }
        // 그러나 연속되지 않는 값이면?
        // 300, 110, 22589, 3840.... 이라면
        // 따로 파일을 만들고, 그 파일의 값을 불러와
        // 반복하여 값을 넣는 과정을 사용하면 된다.
        float foo1[] = {1.0f, 2.0f, 3.0f};



    }
}
