package statement;

import java.util.Random;

public class ifTest03 {
	 public static void main(String[] args) {
	
	Random rand = new Random();
    int input2 = rand.nextInt(10) + 1;
    if (input2 > 0) {
        if (input2 % 2 == 1) {
            System.out.println(input2 + "양수이면서 홀수");
        } else {
            System.out.println(input2 +"양수이면서 짝수");
        }
    } else {
        System.out.println(input2 +"음수");
    }
	 }
}
