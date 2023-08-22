package exception;

import java.util.Scanner;

public class MyExcepitonTest {

	public static void main(String[] args) throws MyException {
		Scanner key = new Scanner(System.in);
		System.out.println("프로그램시작");
		System.out.println("step1");
		System.out.println("Step2");
		System.out.println("숫자입력");
		int num = key.nextInt();
		//num이 홀수가 입력되면 예외로 처리= JVM이 인식하는 예외가 아니지만예외를 발생시킨다.
		//throw new 사용자정의예외클래스();
		//

		if(num%2==1) {
			try {
				//throw는 인위적으로 예외를 발생시킬떄 throws 예외를 처리할떄 던질떄
			throw new MyException("홀수가 입력되었습니다");
			}catch(Exception e) {
				System.out.println("예외처리완료");
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("정상step");
		}
	}

}
