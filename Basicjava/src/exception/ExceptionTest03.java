package exception;

import java.util.Scanner;

public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
		int i =10;
		while(i<=13) {
			System.out.println("나누기할 숫자:");
			int num = key.nextInt();
			System.out.println("값=>"+ i/num);
			i++;
		}
		}catch(Exception e) {
			
		}

	}

}
