package statement;

import java.util.Scanner;

public class IfTest01 {
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int input1 = sc.nextInt();
		
		if(input1 >=90 ) {
		System.out.println("pass");
	}
		else {
			System.out.println("fail");
		}
		
		//========================================
		if(input1 >=0 && input1 <=100) {
			if(input1 >=90 ) {
				System.out.println("pass");
			}
				else {
					System.out.println("fail");
				}
		}else {
				System.out.println("잘못 입력");
			}
	 }
}
