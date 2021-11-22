
public class ReverseString {

	public static void main(String[] args) {
		String r = reverse("greenworld");
		System.out.println(r);

	}
	public static String reverse(String s) {
		char[] ls = new char[s.length()];
		int letterIndex = 0;
		for(int i = s.length() -1; i >= 0; i--) {
			ls[letterIndex] = s.charAt(i);
			letterIndex++;
			
		}
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			reverse = reverse + ls[i];
		}
		return reverse;
}

}
