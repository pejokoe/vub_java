import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	
	private List<Book> inventory;
	private List<User> users;
	private int uniqueID = 0;
	
	public Library() {
		inventory = new ArrayList<>();
		users = new ArrayList<>();
	}
	
	public void addUser(User user) {
		if (users.contains(user)) {
			System.out.println("This user is already registered at our library!");
		} else {
			users.add(user);
		}
		
	}
	
	public void addBook(Book book, int quantity) {
		book.addAvailableQuantity(quantity);
		if (!inventory.contains(book)) {
			inventory.add(book);
		}
	}
	
	public void checkOutBook(User user, Book book) {
		if (!users.contains(user)) {
			System.out.println("This user is not registered at our library!\n");
		} else {
			if (!inventory.contains(book)) {
				System.out.println("Our library does not hold this book!\n");
			} else {
				if (! (book.getAvailableQuantity() > 0)) {
					System.out.println("This book is currently not available!\n");
				} else {
					user.checkOut(book);
					book.checkOut();
				}
			}
		}	
	}
	
	public void giveBack(User user, Book book) {
		user.giveBack(book);
		book.giveBack();
	}
	
	public void contactAllCheckedOut() {
		for (User user : users) {
			List <Book> usersBooks = user.getCheckedOut();
			if (usersBooks.size() > 0) {
				System.out.printf("Hello %s, we ask you to return the %d books you have checked out.\nThe books are: \n",
						user.getName(), usersBooks.size());
				for (Book book : usersBooks) {
					System.out.println(" " + book.getTitle());
				}
			}
				
			
		}
	}
	
	public void printBooks() {
		for (Book b : inventory) {
			System.out.println(b);
		}
	}
}
