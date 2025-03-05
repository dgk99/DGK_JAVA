package lec240927;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        // 1 <= 입력 값 <= 10 -> Do something

//        Scanner sc = new Scanner(System.in);
//
//        int inputValue = sc.nextInt();
//
//        if (inputValue >= 1 || inputValue <= 10) {
//            System.out.println("Do something");
//        } else {
//            System.out.println("Wrong");

        boolean isOpened = false;

        // 방문이 열려 있다.
        isOpened = true;

        // 방문이 닫혀 있다.
        isOpened = false;

        // 방문이 닫혀 있으면 실행
        if (!isOpened) {
            System.out.println("Do something");
        }


        }
        // inputValue >= 1 || inputValue <= 10 -> Logical operator
        // inputValue >= 1 | inputValue <= 10 -> Bitwise operator

        // inputValue >= 1 && inputValue <= 10 -> Logical operator
        // inputValue >= 1 & inputValue <= 10 -> Bitwise operator



    }

