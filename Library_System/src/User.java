import java.util.ArrayList;
import java.util.List;


public class User {
	private String name = new String();
	private List<Book> checkedOutBooks; 
	
	public User(String name) {
		this.name = name;
		checkedOutBooks = new ArrayList<>();
	}
	
	public void checkOut(Book book) {
		checkedOutBooks.add(book);
	}
	
	public void giveBack(Book book) {
		if (!checkedOutBooks.contains(book)) {
			System.out.println("This book is not currently checked out by this user!\n");
		} else {
			checkedOutBooks.remove(book);
		}
	}
	
	public List<Book> getCheckedOut(){
		return checkedOutBooks;
	}
	
	public String getName() {
		return this.name;
	}
}
