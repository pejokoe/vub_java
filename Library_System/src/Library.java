import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	
	private List<Book> inventory;
	private List<User> costumers;
	
	public Library(ArrayList<Book> books) {
		inventory = books;
		users = new ArrayList<>();
	}
	
	

	private String[] book_inventory = {"Harry Potter 1", "Harry Potter 2", "Harry Potter 3", "Harry Potter 4", 
			"Harry Potter 5", "Harry Potter 6", "Harry Potter 7"};
	
	public void checkOutBook(User user, Book book) {
		if (costumers.contains(user) && inventory.contains(book)) {
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Running test");
		
		
	}
}
