package statement;

import java.util.Scanner;

public class MultiifExam {
	public static void main(String[] args) {
		Scanner key=  new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int scn = key.nextInt();
		if (scn >= 0 && scn <= 100) {
			System.out.println("학점평가");
		if(scn>=0 && scn<=59) {
			System.out.println("점수:" +scn + "F학점.");
		}
		else if(scn>=60 && scn<=69) {
			System.out.println("점수:" +scn + "D학점.");
		}
		else if(scn>=70 && scn<=79) {
			System.out.println("점수:" +scn + "C학점.");
		}
		else if(scn>=80 && scn<=89) {
			System.out.println("점수:" +scn + "B학점.");
		}
		else if(scn>=90 && scn<=100) {
			System.out.println("점수:" +scn + "A학점.");
		}
		else {
			System.out.println("잘못입력");
		}
		}
		else {
			System.out.println("잘못입력");
		}
	}
}
