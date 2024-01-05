package lab4.Lab4Part2;

import java.util.HashSet;

public class Library {
	
	HashSet<Book> books;
	
	public Library() {
		books = new HashSet<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public boolean bookExists(Book book) {
		return books.contains(book);
	}

}
