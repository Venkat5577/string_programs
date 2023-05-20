package strings;

public class Vowel {

	public static void main(String[] args) {
		String str="aeiouAEIOU";
		String s="TV";
		boolean res=false;
		for(int i=0;i<s.length();i++) {
			if(str.indexOf(s.charAt(i))!=-1) {
				res=true;
				break;
			}
		}
		System.out.println(res);
	}


}
