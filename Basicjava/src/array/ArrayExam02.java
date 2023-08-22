package array;

import java.util.Random;

public class ArrayExam02 {
  // for 2개로 나눠라? 알고리즘에서는 문제 발생 가능성?
  // 몰라? ㅁㄴㅇ
    public static void main(String[] args) {
        int i = 0;
        Random rand = new Random();
        int array[] = new int[5];
        
        for (i = 0; i < array.length; i++) {
        	array[i] = rand.nextInt(100) + 1;
         	array[i] = rand.nextInt(1,101);
            if (array[i] % 2 == 0) {
                System.out.println(i + "번 요소 " + array[i] + " (짝수)");
            } else {
                System.out.println(i + "번 요소 " + array[i] + " (홀수)");
            }
        }
    }
}