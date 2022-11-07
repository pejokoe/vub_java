public class Pyramid {
	private double length;
	private double height;
	private int sides;
	//to be calculated
	private double volume;

	//constructor
	public Pyramid(double length, double height, int sides) {
		this.length = Math.abs(length);
		this.height = Math.abs(height);
		if (sides == 3) {
			this.sides = 3;
		} 
		else {
			this.sides = 4;
			if (sides != 4) {
				System.out.println("The 'sides' input was changed to 4!");
			}
		}
	}

	//calculate Volume of the pyramid
	public double getVolume() {
		this.volume = this.height * base(this.length, this.sides) / 3;
		return this.volume;
	}
	
	//calculate the base of the pyramid
	public double base(double length, int sides) {
		double area;
		if (sides == 3) {
			area = length * Math.sqrt(Math.pow(length, 2)-Math.pow(length/2, 2)) * 0.5;
			return area;
		} else {
			area = length * length;
			return area;
		}
	}
}
