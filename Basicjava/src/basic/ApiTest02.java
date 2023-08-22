package basic;

import java.util.Random;

public class ApiTest02 {

	public static void main(String[] args) {
		int i =10;
		System.out.println("기본형변수:" +i);
		
		
		/*
		 * 1. String 클래스에 정의되어 있는 charAt 메소드를 이용
		 * 2. 메모리에 올라간 String 클래스를 사용하기 위해 동일한 타입의 변수를 선언에서 할당하기
		 * 3. .연산자를 이용해서 힙에 할당된 String을 찾아가서 필요한 기능을 참조해서 사용
		 * 4. 메소드
		 * 5. 매개변수를 확인하고 알맞은 값을 넣어서 호출한다
		 */
		
		Random rand= new Random();
		System.out.println("참조용변수"+ rand);
		String str = new String("java programming");
		str.length();
		int resukt = str.length();
		System.out.println(""+ resukt);
		
		String result2 = str.toUpperCase();
		System.out.println(result2);
	}

}
