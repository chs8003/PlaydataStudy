package statement;

import java.util.Scanner;

public class MultiTest {
	public static void main(String[] args) 	{
		Scanner key=  new Scanner(System.in);
		System.out.println("주민번호 입력");
		int scn = key.nextInt();
		if(scn==1 | scn ==3) {
			System.out.println("남자");
		}
		else if(scn==2 | scn==4) {
			System.out.println("여자");
		}else {
			System.out.println("기타");
		}
		
	}
}
