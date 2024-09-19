package lec240919;

public class test {
    public static void main(String[] args) {

        char bar = 'A';
        System.out.println((int)bar + ":\t" + bar); // 명시적 형 변환

        for (; bar <= 'Z'; bar++) { // 먼저 기본적인 for문의 원형을 작성
            System.out.print(bar + "\t");
        }
        System.out.println();

        for (char foo = 'A'; foo <= 'Z'; foo += 2) {
            System.out.print(foo + "\t");
        }
        System.out.println();

        for (char pos = 'z'; pos >= 'a'; pos--) {
            System.out.print(pos + "\t");
        }
    }
}
