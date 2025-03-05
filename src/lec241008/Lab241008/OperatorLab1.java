package lec241008.Lab241008;

class BitSet {

    int state = 0;

    // 비트 설정 메서드
    void setBit(int position, boolean value) {
        // position 위치에 비트 값 설정

        // value가 true면 | 연산과 쉬프트 연산(1 << position)을 사용해 1로 설정
        if (value) {
            state = (1 << position) | state;
            System.out.println(state);
            // value가 false면 & 연산과 비트 반전(~)을 사용해 0으로 설정
        } else {
            state = ~(1 << position) & state;
            System.out.println(state);

        }

    }
    // 비트 조회 메서드
    boolean getBit(int position) {
        // position 위치의 비트 값 반환
        // return 문과 함께 & 연산과 쉬프트 연산(1 << position)을 사용해 특정 위치의 비트 값을 확인

        int getMask = (1 << position) & state;
        boolean result = (state & getMask) != 0;

        return result;

    }
}
public class OperatorLab1 {
    public static void main(String[] args) {
        // 메소드 작성 후 실행 예시:
        BitSet bitset = new BitSet();
        bitset.setBit(5, true); // 5번째 비트를 1로 설정
        System.out.println(bitset.getBit(5)); // 출력: true
        System.out.println(bitset.getBit(3)); // 출력: false
    }
}
