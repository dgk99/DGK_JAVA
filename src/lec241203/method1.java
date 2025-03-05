package lec241203;

public class method1 {

//    static void getSum(int argA, int argB){
//        int sum = argA + argB;
//
//    }
//
//    static void saySomething(){
//        System.out.println("Hello World");
//    }

//    static void saySomething(int argA) {
//
//        if (argA == 1){
//            return;
//            // argA가 1이면, 함수를 종료시키는 역할
//        }
//
//        System.out.println("hello");
//    }

    static int[] getSumAvg(int argA, int argB) {
        int sum = argA + argB;
        int avg = sum / 2;

//        int[] retValue = {sum, avg};
        int[] retValue = new int[2];
        retValue[0] = sum;
        retValue[1] = avg;

        return retValue;
    }

    public static void main(String[] args) {

        int[] bar = getSumAvg(2, 6);

        System.out.println(bar[0] + " " + bar[1]);

    }
}
