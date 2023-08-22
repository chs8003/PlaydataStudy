package statement;

import java.util.Scanner;

public class ForExam {
	public static void main(String[] args) 	{
		int i; 
		Scanner key=  new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int scn = key.nextInt();
		for(i=1; i<=9; i++) {
			 System.out.print(scn + "x" + i + "=" + (scn * i)+" ");
		}
	}
}
