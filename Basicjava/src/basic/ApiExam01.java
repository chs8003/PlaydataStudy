package basic;

public class ApiExam01 {
	public static void main(String[] args) 	{
		//안녕하세요 문자열을 이용해서 작업하기
		//STring 클래스를 만들고 문자열의 길이 출력
		
		
		String st = new String("안녕하세요");
		int input = st.length();
		System.out.println("문자열의 길이는" + " " +  input);
		
		// charAt을 호출해서 결과 출력해보기
		char input2 = st.charAt(1);
		System.out.println("두번쨰 는" + " " +  input2);
		
	}
}
