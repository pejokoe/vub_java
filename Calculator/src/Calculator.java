
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
	
	public boolean isPrime(int number) {
		for (int i = 2; i < number/2; i++) {
			if (number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int fibonacciNumber(int N) {
		if (N <=0 ) return -1;
		int a = 1;
		int b = 1;
		int tmp;
		for (int i = 0; i < N - 2; i++) {
			tmp = b;
			b += a;
			a = tmp;
		}
		return b;
		
	}
	
	public boolean armstrongNumbers(int number, int power) {
		char[] digits = String.valueOf(number).toCharArray();
		int tmp = 0;
		for (int i = 0; i < digits.length; i++) {
			tmp += Math.pow(Character.getNumericValue(digits[i]), power);
		}
		return (number == tmp); 
	}
	
	public long factorial(int N) {
		if(N>0) {
			return N * factorial(N-1);
		} else {
			return 1;
		}
	}
	
	public int numberReversal(int number) {
		char [] digits = String.valueOf(number).toCharArray();
		System.out.println(digits.getClass());
		char [] reverse = new char[digits.length];
		for (int i = 0; i < digits.length; i++) {
			reverse[i] = digits[digits.length-1-i];
		}
		return Integer.parseInt(new String(reverse));
		
	}
	
	public int[] productMaximiser(int[]a, int[]b) {
		int max = 0;
		int idxA = -1;
		int idxB = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] * b[j] > max) {
					max = a[i] * b[j];
					idxA = i;
					idxB = j;
				}
			}
		}
		int [] ret = new int[] {idxA, idxB};
		return ret;
	}
	
	public static void main(String[] args) {
		Calculator test = new Calculator();
		double a = test.divide(3, 0);
		System.out.println(a);
		int b = test.divideInt(5, 2);
		System.out.println(b);
		System.out.println(test.isPrime(1201));
		System.out.println(test.fibonacciNumber(37));
		System.out.println(test.armstrongNumbers(548834, 6));
		System.out.println(test.factorial(17));
		System.out.println(test.numberReversal(123));
		int[] arr1 = new int[] {1, 2, 3, -4, -5};
		int[] arr2 = new int[] {3, 20, 4, -26, 10};
		int[] result = test.productMaximiser(arr1, arr2);
		System.out.printf("%d, %d", result[0], result[1]);
	}
}
