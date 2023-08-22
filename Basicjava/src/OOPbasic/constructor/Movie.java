package OOPbasic.constructor;

public class Movie {
	private String title;
	private String genre;
	
	public Movie() {
		System.out.println("기본생성자");
	}
	
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}

}
