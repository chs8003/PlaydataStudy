package OOPbasic;

import java.io.IOException;

public class SingleToneTest {
	public static void main(String[] args) throws IOException {
		System.out.println("start");
		SingleTone obj1 = SingleTone.getInstance();
		SingleTone obj2 = SingleTone.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같");
		}
		else {
			System.out.println("다");
		}
		
	}
}
