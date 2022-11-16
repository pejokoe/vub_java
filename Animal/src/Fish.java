
public class Fish extends Animal{
	
	@Override
	public String name() {
		return "fish";
	}
	
	@Override
	public String food() {
		return "all kinds of things";
	}
	
	@Override
	public boolean vegetarian() {
		return false;
	}
	
	@Override
	public int nrOfLegs() {
		return 0;
	}
	
	@Override
	public String sound() {
		return "blubb";
	}
}
