package api.lang;
//스트링 객체의 비교
//리터럴로 생성(상수풀)
// new연산자를 이영헤서 셍상
public class StringTest02 {

	public static void main(String[] args) {
		//리터럴로 할당되는 String 객체와 new 연산자로 생성되는 String객체는 다른 메모리에 할당된다
		// new 연산자는 무조건 새로 만들기 떄문에
		// 문자열이 같으면 상수풀에는 두번생성되지 않고 같은 객체로 인식됌 =한번만 할당됌(리터럴)
		// new 연산자를 이용해서 생성하는 경우 무조건 새로 생성 
	String str1 = "java";
	String str2 = "java";
	String str3 = new String("java");
	String str4 = new String("java");
	if(str1==str2) {
		System.out.println("같다");
	}
	else {
		System.out.println("디르다.");
	}
	System.out.println("=========================");
	if(str3==str4) {
		System.out.println("같다");
	}
	else {
		System.out.println("디르다.");
	}
	System.out.println("=========================");
	if(str1==str4) {
		System.out.println("같다");
	}
	else {
		System.out.println("디르다.");
	}	
  }
}
