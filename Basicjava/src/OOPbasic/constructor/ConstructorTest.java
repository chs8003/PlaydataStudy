package OOPbasic.constructor;

import java.io.IOException;

public class ConstructorTest {
	public static void main(String[] args) throws IOException {

		Consturctor obj = new Consturctor("최현식", "aaa", "1234", "김포", "3489","김현식");
		System.out.println(obj.getName());
		
		
		Consturctor obj3 = new Consturctor("최현식", "aaa", "1234", "김포", "3489","김현식", 120);
		System.out.println(obj3.getName());
	
	}
}
