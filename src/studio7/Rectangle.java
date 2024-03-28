package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}
	
	public boolean isSquare() {
		return length == width;
	}

	public boolean hasSameArea(Rectangle otherRectangle) {
		return area() == otherRectangle.area();
	}

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(2, 1);
		Rectangle rectangle2 = new Rectangle(4, 3);
		rectangle1.hasSameArea(rectangle2);
	}

}


