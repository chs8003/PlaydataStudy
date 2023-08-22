package OOPbasic.constructor;

public class Student {
	private String name;
	private int age;
	private int id;
	

	public Student() {
	}
	

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}


	public String getName() {
	    return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public void display() {
		System.out.println("이름" +name + "나이"+  age + "학번"+ id);
	}
}
