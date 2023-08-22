package basic;

import java.util.Random;

public class ApiExam02 {
	public static void main(String[] args) 	{
		//자바 유틸 패키지의 랜덤을 이용
		// 변수명 rand
        //1번
		Random rand = new Random();
		int input = rand.nextInt();
		System.out.println("랜덤수:" + input);
		
		//2번
		int input2 = rand.nextInt(100)+1;
		System.out.println("랜덤수:" + input2);
		
	}
}
