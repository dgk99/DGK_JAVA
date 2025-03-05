package Lab.lab241031;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        // 입력 나이를 기준으로 연령대 판단 프로그램
        // 사용자가 입력한 나이를 기준으로 여러 연령대에 맞는 메시지를 출력하는 프로그램 작성
        // 단, 음수를 입력할 경우 "나이는 음수가 될 수 없습니다. 다시 입력하세요."
        // 라는 메시지를 출력하고, 올바른 값을 입력할 때 가지 다시 입력을 받는다

        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {
            System.out.print("나이를 입력하세요: ");
            age = sc.nextInt();

            // 나이가 음수일 경우, 양수를 받을 때 까지 계속 반복
            if (age < 0){
                System.out.println("나이는 음수가 될 수 없습니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        String output = "";

        // 0세 이상 12세 이하는 "어린이"
        if (age >= 0 && age <= 12) {
            output = "어린이";
        // 13세 이상 17세 이하는 "청소년"
        } else if (age >= 13 && age <= 17) {
            output = "청소년";
        // 18세 이상 64세 이하는 "성인"
        } else if (age >= 18 && age <= 64) {
            output = "성인";
        } else { // 65세 이상은 "노인"
            output = "노인";
        }
        System.out.println(output);
    }
}
