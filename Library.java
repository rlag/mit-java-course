//Ross Lagoy Library.java
//1.2015 MIT courseware
//Creates a new library object with an array of books from Book.java

public class Library {
	// Add the missing implementation to this class
	String address;
	String hours;
	String title;
	Book[] catalog = new Book[0];
	int numberofBooks = 0;

	// Creates a new library
	public Library(String location) {
		address = location;
	}

	// Creates library address
	public void printAddress() {
		System.out.println(address);
	}

	// Creates library hours
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	// Adds a book to the library
	public void addBook(Book newbook) {
		if (numberofBooks >= 0) {
			Book[] newarray = new Book[(numberofBooks + 1)];
			System.arraycopy(catalog, 0, newarray, 0, numberofBooks);
			catalog = newarray;
		}
		catalog[numberofBooks] = newbook;
		numberofBooks++;
	}

	// Borrow a book from a library
	public void borrowBook(String title) {
		String string1 = title;
		if (catalog.length == 0) {
			System.out.println("Sorry, this book is not in our catalog.");
		}
		for (int i = 0; i < catalog.length; i++) {
			if (string1.equals(catalog[i].title)
					&& catalog[i].isBorrowed() == false) {
				catalog[i].borrowed();
				System.out.println("You successfully borrowed "
						+ catalog[i].getTitle() + ".");
				break;
			} else if (string1.equals(catalog[i].title)
					&& catalog[i].isBorrowed() == true) {
				System.out.println("Sorry, this book is already borrowed.");
				break;
			} else if (string1.equals(catalog[i].title) == true) {
				System.out.println("Sorry, this book is not in our catalog.");
				break;
			}
		}
	}

	// Print available books in library
	public void printAvailableBooks() {
		if (catalog.length == 0) {
			System.out.println("No books in catalog currently.");
		}
		for (int i = 0; i < numberofBooks; i++) {
			if (catalog.length > 0 && catalog[i].borrowed == false) {
				System.out.println(catalog[i].title);
			}
		}
	}

	// Return books to library list
	public void returnBook(String title) {
		String string1 = title;
		for (int i = 0; i < catalog.length; i++) {
			if (string1.equals(catalog[i].title)
					&& catalog[i].isBorrowed() == true) {
				catalog[i].returned();
				System.out.println("You successfully returned "
						+ catalog[i].getTitle() + ".");
			}
		}
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("La Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lord of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library.");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library.");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lord of the Rings to the first library
		System.out.println("Returning The Lord of the Rings");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();

		// Try to borrow The Lord of the Rings & A Tale of Two Cities from both
		// libraries
		System.out
				.println("Borrowing The Lord of the Rings & A Tale of Two Cities:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("A Tale of Two Cities");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("A Tale of Two Cities");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library.");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library.");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lord of the Rings to the first library
		System.out.println("Returning The Lord of the Rings");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();

		// Return A Tale of Two Cities to the first library
		System.out.println("Returning A Tale of Two Cities");
		firstLibrary.returnBook("A Tale of Two Cities");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}
