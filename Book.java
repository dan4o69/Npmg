
public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	String getPublisher() {
		return publisher;
	}
	String getIsbn() {
		return isbn;
	}
	
	public Book() {
		this.title = "Game of thrones";
		this.author = "George R. R. Martin";
		this.publisher = "Ciela";
		this.isbn = "978-954-26-1624-5";
	}
	
	public Book(String title, String author, String publisher, String isbn) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	
	public String toString() {
		return String.format("%s, %s, %s, %s", getTitle(), getAuthor(), getPublisher(), getIsbn());
	}
}
