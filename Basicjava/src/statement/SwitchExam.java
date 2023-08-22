package statement;

import java.util.Scanner;

public class SwitchExam {
	public static void main(String[] args) {
		Scanner key=  new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int scn = key.nextInt();
		if (scn >= 0 && scn <= 100) {
			switch(scn/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:	
				System.out.println("B학점");
				break;
			case 7:	
				System.out.println("C학점");
				break;
			case 6:	
				System.out.println("D학점");
				break;
			case 5:	
				System.out.println("F학점");
				break;
			default:
				System.out.println("성적 측정 불가");
			
			}
		}
		else {
			System.out.println("잘못입력");
		}
	}
}
