package lec241015;

public class If {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("A 등급");
        } else if (score >= 80) {
            System.out.println("B 등급");
        } else if (score >= 70) {
            System.out.println("c grade");
        } else {
            System.out.println("f");
        }
    }
}
