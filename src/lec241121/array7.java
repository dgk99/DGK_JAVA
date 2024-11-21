package lec241121;

public class array7 {
    public static void main(String[] args) {

        int[][] bar = new int[3][3];

        bar[0][1] = 10;
        bar[0][2] = 20;
        bar[1][1] = 30;
        bar[1][2] = 40;
        bar[2][1] = 50;
        bar[2][2] = 60;

        // Loop: row  0 -> 2
            // Loop: col 0 -> 2
        for (int row = 0, value = 10; row < bar.length; row++) {
            for (int col = 0; col < bar[row].length; col++, value += 10) {
                bar[row][col] = value;
                System.out.print(bar[row][col] + " ");
            }
            System.out.println();
        }

        int[][] foo = {{1,2,3}, {4,5,6}, {7,8,9}};

    }
}
