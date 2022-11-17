import java.util.ArrayList;
import java.util.List;


public class User {
	private String name = new String();
	private List<Book> checkedOutBooks; 
	
	public User(String name) {
		this.name = name;
		checkedOutBooks = new ArrayList<>();
	}
}
