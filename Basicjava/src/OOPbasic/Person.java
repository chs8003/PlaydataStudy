package OOPbasic;

public class Person {
	//클라스의 특성을 나타내는 데이터를 정의 => 필드 or 멤버변수
	//클라스의 초기값은 배열의 초기값과 똑같음 String=null, int=0
	public String name; //같은 패키지, 다른 패키지 모두 클래스에서 사용가능
	String addr; // default -> 같은 패키지의 클라스에서만 사용 가능
	private int age; // private -> 선언된 클라스에서만 사용 가능
}
