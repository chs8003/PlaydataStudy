package OOPbasic;

public class PersonTest2 {
	public static void main(String[] args) {
	Person2 p1 = new Person2();
	p1.setName("최현식");
	p1.setAddr("독산");
	p1.setAge(15);
	
	System.out.print(p1.getName() + p1.getAddr() + p1.getAge());
	}
}
