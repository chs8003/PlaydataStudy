package OOPbasic.constructor;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public String getName() {
	    return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void display() {
		System.out.println("이름" +name + "나이"+  age + "담당과목"+ subject);
	}
	
}
