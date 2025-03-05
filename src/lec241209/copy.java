package lec241209;

public class copy {

    // shallow copy
    static int[] copyVector(int[] argVector){

        return argVector;

        // 자료 구조를 가리키는 참조 변수의 주소 값을 넘겨 받음
        // 특징
        // 메모리 복사가 이루어지지 않음.
        // 효율적일 수 있으나, 원본 자료가 유지되지 않을 수 있다.
    }

    // deep copy
    static int[] copyDeepVector(int[] argVector){
        int[] temp = new int[argVector.length];

        for (int i = 0; i < argVector.length; i++) {
            temp[i] = argVector[i];
        }
        return temp;
        // 동일한 자료 구조를 메모리 공간에 만들고, 값들을 복사
        // 원본 데이터를 유지하고 싶다면 사용
    }

    public static void main(String[] args) {

        int[] bar = new int[5];

        int[] foo = copyVector(bar);

        // deep copy
        // 값 그 자체를 복사. 원본 데이터에 영향을 주지 않음
//        int bar = 2;
//        int foo = 0;
//        foo = bar; // Deep copy : bar의 값이 foo로 복사
//        foo = 3;
//        System.out.println(bar);

        // shallow copy
        // 메모리 주소 값을 복사. 원본 데이터에도 영향을 미침
//        int pos[] = {2};
//        int kin[];
//        kin = pos; // Shallow copy: pos 값을 kin으로 복사
//        kin[0] = 10;
//        System.out.println(pos[0]);

        // 복사된 자료형이 pri냐 ref냐의 차이

    }
}
