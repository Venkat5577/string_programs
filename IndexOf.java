package strings;

public class IndexOf {
	
	public static void main(String[] args) {
		String s = "hello";
		String[] s1 = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
					s1[j] = "1";
				}
			}
			int[] a = new int[count];
			if (s1[i] != "1" && count >= 1) {
				for (int j = 0, k = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						a[k] = j;
						k++;
					}
				}
				System.out.println(s.charAt(i) + " occurs at");
				for (int j = 0; j < a.length; j++) {
					System.out.println(a[j]);
				}
			}
		}
		//

	}

}
