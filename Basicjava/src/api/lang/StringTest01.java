package api.lang;

public class StringTest01 {
	public static void main(String[] args) {
		byte[] data1 = {97,98,100,96,95};
		String str= new String(data1);
		String str2 = new String(data1,2,3);
		System.out.println(str);
		System.out.println(str2);
		
		char[] data2 = {'a','b','c','d'};
		String str3 = new String(data2);
		String str4 = new String(data2,1,2);
		System.out.println(str3);
		System.out.println(str4);
 	}
}
