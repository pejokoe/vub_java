
public class Elephant extends Animal{
	
	@Override
	public String name() {
		return "elephant";
	}
	
	@Override
	public String food() {
		return "veggies";
	}
	
	@Override
	public boolean vegetarian() {
		return true;
	}
	
	@Override
	public int nrOfLegs() {
		return 4;
	}
	
	@Override
	public String sound() {
		return "toot";
	}
}
