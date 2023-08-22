package OOPbasic.polymorphism;


//추상 클라스는 상위 클라스의 역할
//객체를 생성 할 수없는 클라스
// 내용이 구현되어 있찌 안흔 메서드를 포함하고 있는 클래스를 추상클라스라 한다
//추상메서드(body가 없는 메소드(
// 접근제어자 abstarct 리턴타입 메서드명(매개변수1,2...);

abstract class Parent{
	public void test() {
	System.out.println("test: 일반메소드");

}
	//
	public abstract void display(String msg);
}

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
