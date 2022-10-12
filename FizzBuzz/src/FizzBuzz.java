
public class FizzBuzz {
	private int start;
	private int end;

	public FizzBuzz(int start, int end) {
		this.start = start;
		this.end = end;
		
		//not for dodona
		//fizzBuzz();
	}

	public void fizzBuzz() {
		int counter = this.start;
		while(counter <= this.end) {
			if (counter % 3 == 0 && counter % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (counter % 3 == 0) {
				System.out.println("Fizz");
			} else if (counter % 5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(counter);
			}
			counter++;
		}
		return;
	}
	
	public void fizzBuzzOne() {
		fizzBuzz();
	}
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz(0, 20);
	}
}
