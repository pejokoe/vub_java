public class Cat extends Animal{
	
	@Override
	public String name() {
		return "cat";
	}
	
	@Override
	public String food() {
		return "mice";
	}
	
	@Override
	public boolean vegetarian() {
		return false;
	}
	
	@Override
	public int nrOfLegs() {
		return 4;
	}
	
	@Override
	public String sound() {
		return "meow";
	}
}
