package OOPbasic;

import java.util.Scanner;

public class MyMethodDemo {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		MyMethod m = new MyMethod();
        System.out.println("*******미니계산기*******");
        System.out.println("1.더하기");
        System.out.println("2.빼기");
        System.out.println("3.곱하기");
        System.out.println("4.나누기");
        System.out.print("연산자를 선택하세요.");
        int opr = key.nextInt();
        System.out.print("숫자를 입력하세요 ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
		m.add(opr, num1, num2);
	
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
	    int[] ib = new int[]{1,2,3,4,5};
		ArrayExam input3 = new ArrayExam();
		System.out.println("배열ia");
		input3.array(ia);
		System.out.println("배열ib");
		input3.array(ib);
		//ForExam_GuGu input = new ForExam_GuGu();
		//MultiForExam3_GuGu input2 = new MultiForExam3_GuGu();
		//input.printGuGu();
		//System.out.println("\n");
		//input2.gugu();
	}

}
