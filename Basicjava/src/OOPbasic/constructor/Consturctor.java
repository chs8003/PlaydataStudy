package OOPbasic.constructor;
//생성자는 객체가 생성될떄 한번 호출되는 특별한 멘서드
//생성자 메소드는 오버로딩을 지원한다 -> 생성자를 여러개 정의 할 수 있다.
//Setter메서드와 생성자 차이? Setter 메서드는 객체가 만들어진 상태에서 진행, 생성자는 객체를 만들떄 동시에 한번에 초기화시키는것.
public class Consturctor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telnum;
	private String nickname;
	private int point;
	//매개변수가 없는 생성자- 기본 생성자
	public Consturctor() {
		System.out.println("기본생성자");
	}
	
	
	
	//insert용 생성자
	public Consturctor(String name, String id, String pass, String addr, String telnum, String nickname) {
		this.name = name;
		this.id= id;
		this.pass = pass;
		this.addr = addr;
		this.telnum = telnum;
		this.nickname= nickname;
		System.out.println("insert?");
	}
	
	// Select용 생성자
		public Consturctor(String name, String id, String pass, String addr, String telnum, String nickname, int point) {
			//생성자 호출문
			this(name,id,pass,addr,telnum,nickname);
			this.point = point;
			System.out.println("select?");	
			
		}

	public String getName() {
		return this.name;
	}
	
}
