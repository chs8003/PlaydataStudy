package exception;


public class ExceptionTest02 {

	public static void main(String[] args) {
		try {
			System.out.println("try블록");
			System.out.println(10/0);
			System.out.println("종료");
		}
		catch(ArithmeticException e) {
			//예외가 발생하면 처리할 문장을 구현
			//Exception이 발생하지 않으면 캐치블록 실행X
			System.out.println("예외 발생");
			System.out.println("예외 메시지=?"+ e.getMessage());
			e.printStackTrace();
		}
	}

}
