package api.lang;
//스트링 중요 메소드 -2(03-1)
public class SpringTest04 {

	public static void main(String[] args) {
		String str1 =  new String("java programming");
		String str2 = "재밌다";

		System.out.println(str1.startsWith("java"));
		System.out.println(str1.startsWith("test"));
		System.out.println(str1.endsWith("ing"));
		System.out.println(str1.endsWith("java"));
		System.out.println(str1.contains("ja"));
		
		//대소문자 변경
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,9));
		System.out.println(str1.replace('a', 'A'));
		System.out.println(str1);
		System.out.println(str2);
	}

}
