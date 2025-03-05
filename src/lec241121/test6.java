package lec241121;

public class test6 {
    static float[] getSumAvg(int a, int b, int c) {
        float result[] = new float[2];

        result[0] = a + b + c;
        result[1] = result[0] / 3;

        return result;
    }
    public static void main(String[] args) {
        float bar[] = getSumAvg(1, 2, 3);
        System.out.println("sum: " + (int)bar[0]);
        System.out.println("avg: " + (int)bar[1]);

    }
}
