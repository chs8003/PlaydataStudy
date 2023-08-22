package basic;

public class VariableTypeTest {
	public static void main(String[] args) {
		//기본형변수
		int i = 10;
		int j = 10;
		System.out.println("=============기본형==============");
		if(i==j) {                              
			System.out.println("기본형같다.");
		}else {
			System.out.println("기본형다르다.");
		}
		System.out.println("=============참조형==============");
		String str = new String("java");
		String str2 = new String("java");
		str = str2;
		if(str==str2) {
			System.out.println("참조형같다.");
		}else {
			System.out.println("참조형다르다.");
			
			}
		System.out.println("============문자열 비교==============");
		if(str.equals(str2)) {
			System.out.println("문자열 같다");
	}
		else {
			System.out.println("문자열 안같다");
		}
	
}
}