package OOPbasic.polymorphism;

public class Video extends Content {
	private String genre;
	
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void totalPrice() {
		if(this.genre.equals("new")) {
			price = 2000;
		}
		else if(this.genre.equals("comic")) {
			price = 1500;
		}
		else if(this.genre.equals("child")) {
			price = 1000;
		}
		else{
			price = 500;
		}
	}

}
