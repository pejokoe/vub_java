import java.util.Arrays;

public class TextManipulation {

	public TextManipulation() {
		return;
	}
	
	public String convertToUpperCase(String s) {
		return s.toUpperCase();
	}
	
	public String convertToLowerCase(String s) {
		return s.toLowerCase();
	}
	
	public boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] tmp_a = a.toCharArray();
		char[] tmp_b = b.toCharArray();
		Arrays.sort(tmp_a);
		Arrays.sort(tmp_b);
		return Arrays.equals(tmp_a, tmp_b);
		
	}
	
	public String reverseString(String a) {
		char[] tmp_a = a.toCharArray();
		char[] tmp_b = new char[tmp_a.length];
		for(int i = 0; i < tmp_a.length; i++) {
			tmp_b[i] = tmp_a[tmp_a.length-1-i];
		}
		a = new String(tmp_b);
		return a;
	}
	
	public static void main(String[] args) {
		TextManipulation test = new TextManipulation();
		System.out.println(test.isAnagram("Peter", "ReetP"));
		System.out.println(test.reverseString("gfedcba"));
		
	}
}
