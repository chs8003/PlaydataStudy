package OOPbasic.constructor;


public class TestSchool {
	public static void main(String[] args) {
	
		Student s = new Student("최현식", 24, 20180958);
		Teacher t = new Teacher ("김현식", 24,"국어");	
		Staff  e = new Staff("최현식", 24, "개발자");	
		s.display();
		t.display();
		e.display();
	}

}
