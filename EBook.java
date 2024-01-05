package lab4.Lab4Part2;

public class EBook extends Books {
	
	public EBook(String isbn, String title) {
		super(isbn, title);
	}

	@Override
	public double getLength() {
		throw new RuntimeException();
	}

	@Override
	public double getHeight() {
		throw new RuntimeException();
	}

	@Override
	public double getWidth() {
		throw new RuntimeException();
	}

}
