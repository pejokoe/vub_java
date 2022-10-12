import java.util.Arrays;

public class DataSet {
	private double[] data;
	
	public DataSet(double[] data) {
		this.data = data;
	}
	
	public double getAverage() {
		double avg = 0;
		for(int i = 0; i < data.length; i++) {
			avg += data[i]; 
		}
		return avg/data.length;
	}
	
	public void add(double to_add) {
		double[] tmp = new double[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			tmp[i] = data[i];
		}
		tmp[data.length] = to_add;
		data = tmp;
	}
	
	public double getSmallest() {
		double smallest = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < smallest) smallest = data[i];
		}
		return smallest;
	}
	
	public double getLargest() {
		double largest = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > largest) largest = data[i];
		}
		return largest;
		
	}
	
	public double getRange() {
		return getLargest()-getSmallest();
	}
	
	public String get() {
		return Arrays.toString(data);
	}
	
	public static void main(String[] args) {
		double[] init = {1.1, 2.2, 20.4, 3.3, 4.4, 0.5};
		DataSet test = new DataSet(init);
		System.out.println(test.getAverage());
		test.add(11.11);
		System.out.println(test.get());
		System.out.println(test.getSmallest());
		System.out.println(test.getLargest());
		System.out.println(test.getRange());
	}
}
