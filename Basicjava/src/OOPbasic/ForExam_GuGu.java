package OOPbasic;

import java.util.Scanner;

public class ForExam_GuGu {
	public void printGuGu() {
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		System.out.println("출력할 단:"+i);
		for(int j=1; j<=9; j++) {
			System.out.print(j + "x" + i + "=" + (j * i)+ " ");
		}
	}
}
