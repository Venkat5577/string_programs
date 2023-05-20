package strings;

public class Occurance {
	public static void main(String[] args) {
		String s = "java";
		String[] s1=new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
					s1[j]="1";
				}
			}
			if(s1[i]!="1"&& count>=1) {
				System.out.println(s.charAt(i)+" occurs "+count);
			}

		}
		
	}
}
			
				
		
