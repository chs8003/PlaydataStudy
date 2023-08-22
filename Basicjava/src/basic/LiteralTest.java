package basic;

public class LiteralTest {
	public static void main(String[] args) 	{
		int num =100;
		num = 100;
		
		boolean bool = false;
		System.out.println(bool);
		
		byte b = 127;
		byte b2 = (byte)1234;
		System.out.println(b);
		System.out.println(b2);
		
		short s =32767;
		System.out.println(s);
		
		int i = 2147483647;
		long i2 = 2147483648L; //리터럴 최대 범위는 int 그래서 long써도 안댐(접미사 주면댐)
		System.out.println(i);
		System.out.println(i2);
		
		double d = 10.5;
		System.out.println(d);
		
		float f = 10.5f;
		System.out.println(f);
		
	}

}
