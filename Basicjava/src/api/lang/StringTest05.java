package api.lang;
// 스트림 버퍼는 동시접속에 대한 대응이 되어있음(쓰레드 처리가되아있음)
// 
public class StringTest05 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle html css javastcript jquery");
		
		byte[] data1 = str1.getBytes();
		for(byte b : data1){
			System.out.print(b+" ");
		}
		System.out.println();
		char[] data2 = str1.toCharArray();
		for(char b : data2){
			System.out.print(b);
		}
		System.out.println();
		//String => String
		String[] data3 = str2.split(" ");
		for(String b : data3){
			System.out.print(b+" ");
		}
		System.out.println();
		// 기본형을 String 클래스로 변환
		int i = 1000;
		double d= 10.5;
		test(String.valueOf(i));
		test(String.valueOf(d));	
		test(i+"");
		test(d+"");
		
	}
		public static void test(String data) {
			System.out.println(data);
		}
}
