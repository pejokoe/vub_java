import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private int availableQuantity = 0;
	
	public Book(String title) {
		this.title = title;
	}
	
	public void addAvailableQuantity(int quantity) {
		this.availableQuantity += quantity;
	}
	
	public void checkOut() {
		this.availableQuantity -= 1;
	}
	
	public void giveBack() {
		this.availableQuantity += 1;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		String toReturn = "Book: " + title + "\nQuantity: " + availableQuantity + "\n";
		return toReturn;
	}
}
