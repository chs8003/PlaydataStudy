package OOPbasic;

public class Staff {
	private String name;
	private int age;
	private String job;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getName() {
	    return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return job;
	}
	
	public void display() {
		System.out.println("이름" +name + "나이"+  age + "부서"+ job);
	}
	
}
