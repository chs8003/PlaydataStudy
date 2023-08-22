package OOPbasic;
 
public class StaticExam {
	
	// 1. static 메소드에서 static 메소드 호출(일반적인 방법 show())=> 자신의 클래스 내부에 선언된 메소드명만 입력해서 호출
	public static void test() {show();}    //정적메소드
	
	// 2. non-static 메소드에서 non-static 메소드 호출(일반적인 방법(change))
 	public void display() { change(); }  // 인스턴스 메소드
 	
	public static void show() {}
	public void change() {}        // 인스턴스 메소드
	public void examtest() {}

}
