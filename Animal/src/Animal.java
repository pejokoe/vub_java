
public abstract class Animal {
	public abstract String name();
	public abstract String food();
	public abstract boolean vegetarian();
	public abstract int nrOfLegs();
	public abstract String sound();
	

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal fish = new Fish();
		Animal elephant = new Elephant();
		Animal[] animals = {cat, fish, elephant};
		for (Animal a : animals) {
			System.out.printf("Specifics for a %s\n", a.name());
			System.out.printf("What food?: %s \n", a.food());
			System.out.printf("Is vegetarian?: %s \n", a.vegetarian());
			System.out.printf("How many legs?: %s \n", a.nrOfLegs());
			System.out.printf("What sound?: %s \n", a.sound());
			System.out.println("\n");
		}
			
	}
	
}

