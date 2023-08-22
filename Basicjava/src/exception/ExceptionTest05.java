package exception;

import java.util.Scanner;

public class ExceptionTest05 {
	public static void main(String[] args) {

		try {
			System.out.println("프로그램시작:");

			System.out.println("DV연동:");

			System.out.println("디비처리진행중..."+ 10/0);
			System.out.println("완료");

		}catch(Exception e) {
			System.out.println("어류코드 확인");
		}
	}
}
