package strings;

public class ReplaceSpecialChars {

	public static void main(String[] args) {
		String s = "S^&!%tri()n+g";
		String s1 = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
	}

}
