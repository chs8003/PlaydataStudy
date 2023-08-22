package OOPbasic.constructor;


public class TestMovie {
	public static void main(String[] args) {
		
	Movie mv = new Movie();
	Movie mv1 = new Movie("아바타", "SF");
	System.out.println(mv1.getTitle() +  "(" + mv1.getGenre() + ") "+ " 상영중입니다");
	}


}
