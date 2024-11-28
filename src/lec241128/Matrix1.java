package lec241128;

public class Matrix1 {
    public static void main(String[] args) {

        final int FRAME_NUM = 100;
        final int ITEM_NUM = 20;

        float[][] noiseMatrix;

        // 2초짜리 프레임을 100개 저장하는 2차원 Matrix 생성
//        noiseMatrix = new float[FRAME_NUM][ITEM_NUM];
        // 한번에 많은 양을 선언하면, 메모리 공간을 비효율적으로 사용하게 된다.

        noiseMatrix = new float[FRAME_NUM][];
        // 행을 저장할 메모리 공간만 만들어 놓음(메모리를 효율적으로 사용하기 위해)

        // 프레임이 필요할 때 마다 메모리를 할당하니까 메모리 사용 효율성이 높아짐.
        noiseMatrix[0] = new float[ITEM_NUM];
        noiseMatrix[1] = new float[ITEM_NUM];
        // 메모리 공간을 필요할 때 마다 os에게 찍어달라고 하는 것도 효율적이지 않음.
        // 어느 정도 양이 차면 예측해서 늘린다거나, 100개가 다 차면 2배로 늘리는 등
        // 여러 방법으로 효율적으로 확장이 가능

        // 프로그램이 돌아가는 환경이나 내가 만드려는 조건을 생각하여 배열을 만들자
    }
}
