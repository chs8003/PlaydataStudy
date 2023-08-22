package OOPbasic.constructor;

public class Staff {
	private String name;
	private int age;
	private String job;
	
	public Staff() {
		
	}
	
	public Staff(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}


	public void display() {
		System.out.println("이름" +name + "나이"+  age + "부서"+ job);
	}
	
}
