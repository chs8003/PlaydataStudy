package api.lang;
//스트링 클래스의 중요 메소드 살펴보기
public class StringTest03 {

	public static void main(String[] args) {
		String str1= new String("JAVA PROGRAMMING");
		String str2 = "재밌다";
		System.out.println(str1.charAt(1)); 
		System.out.println(str1.concat(str2)); // 합치기
		System.out.println(""+str1+str2); //
		System.out.println(str1.indexOf('A')); //왼쪽부터 0
		System.out.println(str1.indexOf("합"));
		System.out.println(str1.lastIndexOf('A')); //오른쪽부터 0
		System.out.println(str1.lastIndexOf("합"));
		System.out.println(str1.length());
		System.out.println(str1.equals("JAVA PROGRAMMING")); //완전히 다 똑같아야 true
		System.out.println(str1.equals("jAVA PROGRAMMING"));
		System.out.println();
		System.out.println();
	

	}

}
