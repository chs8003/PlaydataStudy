package basic;

public class PrimitiveTypeCastingTest {
	public static void main(String[] args) 	{
		byte b= 100;
		short s =b;
		int i =s;
		long l = i;
		float f = l;
		double d= f;
		System.out.println(d);

		char data1 = 'A';
		int data2 = data1;
		System.out.println(data1);
		System.out.println(data2);
		byte b2 = (byte)1234;
		System.out.println(b2);
		
		int data3 = 97;
		System.out.println((char)data3);
		
		double result = 10/3;
		System.out.println(result);
		
		
		
	}
}
