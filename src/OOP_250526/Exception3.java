package OOP_250526;

import java.io.IOException;

public class Exception3 {
    public static void main(String[] args) {
        try {
            int bar = 1;

            if (bar == 1) {
                throw new IOException("IO Exception 발생");
            }
        } catch (Exception e) {
            if (e instanceof IOException) {
                System.out.println(((IOException) e).getMessage());
            }
        }
    }
}
