package lab4.Lab4Part2;

public class Book extends Books{
	double length;
	double width;
	double height;
	public Book(String isbn, String title, double length, double width, double height) {
		super(isbn, title);
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWidth() {
		return width;
	}

}
