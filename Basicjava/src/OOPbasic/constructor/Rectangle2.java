package OOPbasic.constructor;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int area() {
		int area = this.width * this.length;
		return area;
	}
	
	public int perimeter() {
		int perimeter = (this.width+ this.length)*2;
		return perimeter;
	}
	
}
