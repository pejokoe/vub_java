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

	public String reversString(String a) {
		char[] tmp_a = a.toCharArray();
		char[] tmp_b = new char[tmp_a.length];
		for (int i = 0; i < tmp_a.length; i++) {
			tmp_b[i] = tmp_a[tmp_a.length - 1 - i];
		}
		a = new String(tmp_b);
		return a;
	}

	public String caesarCipherCode(String input, int cipherShift) {
		char[] letters = input.toLowerCase().toCharArray();
		if (cipherShift < 0)
			cipherShift = 26 + cipherShift % 26;
		for (int i = 0; i < letters.length; i++) {
			if ('a' <= letters[i] && letters[i] <= 'z') {
				int tmp = (((int) letters[i] - 97) + cipherShift) % 26;
				letters[i] = (char) (tmp + 97);
			}
		}
		return new String(letters);
	}

	public String caesarCipherDecode(String input, int cipherShift) {
		return caesarCipherCode(input, -cipherShift);
	}

	public static void main(String[] args) {
		TextManipulation test = new TextManipulation();
		System.out.println(test.isAnagram("Peter", "ReetP"));
		System.out.println(test.reversString("gfedcba"));
		System.out.println(test.caesarCipherCode(
				"Ftq cguow ndaiz raj\n"
				+ "vgybe ahqd ftq xmlk pas.\n"
				+ "Ftq ruhq najuzs\n"
				+ "iulmdpe vgyb cguowxk.",
				-12));
//		System.out.println(test.caesarCipherDecode(test.caesarCipherCode("abcd", -60), -60));

	}
}
