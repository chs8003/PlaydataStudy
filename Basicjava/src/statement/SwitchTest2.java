package statement;

import java.util.Scanner;

// if문의 else와 같은 역할을 하는 default 추가
// 비교연산자 사용 불가능
public class SwitchTest2 {
	public static void main(String[] args) 	{
		Scanner key=  new Scanner(System.in);
		System.out.println("주민번호 입력");
		String scn = key.next();
		switch(scn.charAt(1)) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("외계인")
;		}
		
	}
}
