import java.util.ArrayList;
import java.util.Arrays;

public class program_library {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		System.out.println("Running test");
		ArrayList<Book> HP = new ArrayList(Arrays.asList(new Book("Harry Potter 1"), new Book("Harry Potter 2"),
				new Book("Harry Potter 3"), new Book("Harry Potter 4"), new Book("Harry Potter 5"),
				new Book("Harry Potter 6"), new Book("Harry Potter 7")));

		for (int i = 0; i < HP.size(); i++) {
			myLibrary.addBook(HP.get(i), i + 1);
		}
		User Max = new User("Max");
		User Frank = new User("Frank");

		// setup
		myLibrary.addUser(Max);
		myLibrary.addUser(Frank);
		//myLibrary.printBooks();

		// test checkout book
		myLibrary.checkOutBook(Frank, HP.get(4));
		//myLibrary.printBooks();

		// checking out when user not a member
		User noMember = new User("Dummie");
		myLibrary.checkOutBook(noMember, HP.get(4));
		//myLibrary.printBooks();

		// checking out when book not in inventory
		Book notInInventory = new Book("dummie");
		myLibrary.checkOutBook(Frank, notInInventory);
		//myLibrary.printBooks();

		//exceeding the available number of books
		myLibrary.checkOutBook(Frank, HP.get(0));
		myLibrary.checkOutBook(Max, HP.get(0));

		//contact users with their name, number and list of checked out books
		myLibrary.contactAllCheckedOut();
		myLibrary.giveBack(Frank, HP.get(4));
		myLibrary.contactAllCheckedOut();
	}
}
