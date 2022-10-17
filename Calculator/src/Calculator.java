
public class Calculator {
	
	public final double PI = 3.1415;
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public Calculator() {
		return;
	}
	
	public double subtract(double a, double b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double divide(double numerator, double denominator) {
		if(denominator == 0) {
			System.out.println("Division by zero is not possible with this calculator!");
			return numerator;
		}
		return numerator/denominator;
	}
	
	public double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	public double calculateSurfaceCircle(double radius){
		return PI*radius*radius;
	}
	
	public boolean logicOr(boolean a, boolean b) {
		return a || b;
	}
	
	public boolean logicAnd(boolean a, boolean b) {
		return a && b;
	}
	
	public boolean logicNot(boolean a) {
		return !a;
	}
	
	public int addInt(double a, double b) {
		return (int)a + (int)b;
	}
	
	public int subtractInt(double a, double b) {
		return (int)a - (int)b;
	}
	
	public int multiplyInt(double a, double b) {
		return (int)a * (int)b;
	}
	
	public int divideInt(double numerator, double denominator) {
		if(denominator == 0) {
			System.out.println("Division by zero is not possible with this calculator!");
			return (int)numerator;
		}
		return (int)numerator / (int) denominator;
		
	}
	
	public int powerInt(double base, double exponent) {
		return (int) Math.pow((int)base, (int)exponent);
	}
	
	public static void main(String[] args) {
		Calculator test = new Calculator();
		double a = test.divide(3, 0);
		System.out.println(a);
		int b = test.divideInt(5, 2);
		System.out.println(b);
		
	}
}
