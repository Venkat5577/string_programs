package strings;

public class ReverseAndUppercase {

	public static void main(String[] args) {
		String str="This is java class";
		str=str.toLowerCase();
		String[] s=str.split(" ");
		String res="";
		for(int i=0;i<s.length;i++) {
			res=res+reverse(s[i])+" ";
		}
		System.out.println(res);
	}
	public static String reverse(String s) {
		String str="";
		
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		String res="";
		String u=""+str.charAt(0);
		res=u.toUpperCase()+str.substring(1,str.length());
		return res;
	}
}
