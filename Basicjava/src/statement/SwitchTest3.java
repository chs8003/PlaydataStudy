package statement;

//스위치에서 쓸 수 있는 타입은 제한적이다.
//switch 내부의 조건을 평가하기 위한 변수나 식이나 메소드 호출 결과값은 int로 자동캐스팅되는 타입과 String 타입만 가능하다
// 자동캐스팅 타입 = byte, short, int, char
public class SwitchTest3 {
	public static void main(String[] args) 	{
		int data=16;
		float data2 =10.0f;
		double data3=10/5;
		long data4 = 10L;
		short data5 = 15;
		String data6 = new String("01");
		switch(data6) {
		case "01":
			System.out.println("완료");
		}
	}
}
