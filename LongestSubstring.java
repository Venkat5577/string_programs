package strings;

public class LongestSubstring {

	public static void main(String[] args) {
		String s="javaconceptoftheday";
		String res="";
		for(int i=0;i<s.length();i++) {
			String str="";
			for(int j=i;j<s.length();j++) {
				if(str.indexOf(s.charAt(j))==-1) {
					str=str+s.charAt(j);
				}
				else {
					if(str.length()>res.length() && j==s.length()) {
					res=str;
					}
					break;
				}
				if(str.length()>=res.length() && j==s.length()-1) {
					res=str;
					break;
					}
	
			}
		}
		System.out.println(res);
	}

}
