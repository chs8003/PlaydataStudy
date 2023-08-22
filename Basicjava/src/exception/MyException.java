package exception;
//사용자 정의 예외클래스 만들기
// >> MyException을 Exception 클라스로 만들기 위해서는 상속을 해야한다.
// 클라스에서 클라스를 정의할떄 is a 관곈 상속관계
					//has a 관꼐는 멤버변수로 정의 
public class MyException extends Exception {

	public MyException(String msg) {
		super(msg); //Exception 클래스에 메세지를 전달
	}

	public void test(String filename) throws FileNotFoundException, IOException{
		FileReader fr =  FileReader(filename);
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
	}
	
	
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		
		obj.test("test2.txt");
		obj.test("test2.txt");
	}
	}



