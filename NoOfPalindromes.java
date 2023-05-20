package strings;

public class NoOfPalindromes {
public static void main(String[] args) {
	String s="ab12321baikjjk2324";
	int count=0;
	for(int i=0;i<s.length();i++) {
		String str=""+s.charAt(i);
		for(int j=i+1;j<s.length()-1;j++) {
			str=str+s.charAt(j);
			if(palindrome(str)) {
				System.out.println(str);
				count++;
			}
		}

	}
	System.out.println("no of palindromes: "+count);
	
}
public static boolean palindrome(String s) {
	String str="";
	for(int i=0;i<s.length();i++) {
		str=s.charAt(i)+str;
	}
	return str.equals(s);
	
}
}
