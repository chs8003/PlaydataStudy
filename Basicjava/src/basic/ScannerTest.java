package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//키보드를 통해 직접 입력 받은 값을 타입에 따라 각각 읽어서 사용할 수 있도록 지운
	
		Scanner key = new Scanner(System.in);
		/*
		String val0 = key.nextLine();
		System.out.println("입력한 값은:"+ val0);
		
		String val1 = key.next();
		System.out.println("입력한 값은:"+ val1);
		
		int val2 = key.nextInt();
		System.out.println("입력한 값은:"+ val2);
		
		double val3 = key.nextDouble();
		System.out.println("입력한 값은:"+ val3);
	// Scanner는 띄어쓰기 하면 자동으로 입력 다 됌
	*/
		System.out.println("국어 몇점");
		int val6 = key.nextInt();
	
		System.out.println("영어 몇점");
		int val4 = key.nextInt();
	
		System.out.println("수학 몇점");
		int val5 = key.nextInt();

		int sum = val6 + val4 + val5;
		int avg = sum / 3;
		System.out.println("국어:"+val6+" " + "영어:" +val4+" " + "수학:" +val5 +" "+"총점:"+sum+" "+"평균:"+avg);
		
		
	
		
	}
}
