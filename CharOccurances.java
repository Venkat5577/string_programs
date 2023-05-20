package strings;


public class CharOccurances {

	public static void main(String[] args) {
		String s = "aBC3b4c3";
		String res = "";
		for (int i = 1; i < s.length(); i++) {
			String str = "" + s.charAt(i);
			if (isNumber(str)) {
				int n = Integer.parseInt(str);
				for (int j = 1; j <= n; j++) {
					res = res + s.charAt(i - 1);
				}
			}

		}
		System.out.println(res);
		System.out.println("<----------------->");
		String s1="aaabbbbccc";
		String res1="";
		int i=0;
		while(i<s1.length()) {
			char ch=s1.charAt(i);
			int c=1;
			for(int j=i+1;j<s1.length();j++) {
				if(ch==s1.charAt(j)) {
					c++;
					i=j;
				}
				else{
					break;
				}
			}
			res1=res1+ch+c;
			i++;
		}
		System.out.println(res1);
		
	}


	public static boolean isNumber(String s) {
		try {
			int n = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
