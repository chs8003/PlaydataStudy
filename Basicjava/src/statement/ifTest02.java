package statement;

import java.util.Random;
import java.util.Scanner;

public class ifTest02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int input1 = sc.nextInt();

        if (input1 % 5 == 0) {
            System.out.println("5의 배수 입니다.");
        } else {
            System.out.println("5의 배수가 아닙니다.");
        }

       
    }
}