package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = null;
		try {
	
			System.out.println("나누기할 숫자:");
			int num = key.nextInt();
			System.out.println("나눌 숫자:");
			int num2 = key.nextInt();
			System.out.println("값=>"+ num/num2);
			System.out.println(str.length());
			System.out.println("종료");
			
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지마");		
		}catch(InputMismatchException e) {
			System.out.println("문자 x");
		}catch(Exception e) {
			System.out.println("예상치 못한 오류");
		}

	}

}
