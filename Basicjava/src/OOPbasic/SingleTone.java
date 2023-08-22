package OOPbasic;

//동시 접속에 대한 처리 = 객체의 멤버 변수나 메서드를 접근하는 부분에 로직이나 메소드앞에 synchronized(동기화) 작업을 해줘야함=쓰레드 작업
public class SingleTone {
	private static SingleTone singleton = new SingleTone();
	private SingleTone() {
		System.out.println("인스턴스를 생성하였습니다");
	}
	
	
	public static SingleTone getInstance() {
		return singleton;
	}
	
}
