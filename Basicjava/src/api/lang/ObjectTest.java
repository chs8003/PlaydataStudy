package api.lang;

public class ObjectTest {
	//object 메서드(Object 클래스는 모든 클래스의 최상위 클래스)
	// => toString, => 객체를 문자열로 변환
	//    hasdCode=.객체가 할당된 곳의 메모리를 기준으로 값을 계산해서 리턴함
	//    equals => 객체가 가진 값을 비교할 때 사용
	// 
	
	public static void main(String[] args) {
		//equals는 하위클래스에서 객체이 속성을 비겨ㅛ해서 같은 객체
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1==obj2) {
			System.out.println("같다");
		}

	}

}
