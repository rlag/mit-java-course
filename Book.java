//Ross Lagoy Book.java
//1.2015 MIT courseware
//Creates a new book object

public class Book {

	String title;
	boolean borrowed;

	// Creates a new Book
	public Book(String bookTitle) {
		title = bookTitle;
	}

	// Returns the title of the book
	public String getTitle() {
		return title;
	}
	
	// Marks the book as rented
	public void borrowed() {
		borrowed = true;
	}

	// Marks the book as not rented
	public void returned() {
		borrowed = false;
	}

	// Returns true if the book is rented, false otherwise
	public boolean isBorrowed() {
		if (borrowed == true) {
			return true;
		}
		return false;
	}

/*	public static void main(String[] args) {
		// Small test of the Book Class
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title: " + example.getTitle()); // Should be The Da Vinci Code
		System.out.println("Borrowed? " + example.isBorrowed()); // Should be false
		example.borrowed();
		System.out.println("Borrowed? " + example.isBorrowed()); // Should be true
		example.returned();
		System.out.println("Borrowed? " + example.isBorrowed()); // Should be false
	}*/
}