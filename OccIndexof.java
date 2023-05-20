package strings;

public class OccIndexof {
	public static void main(String[] args) {
		String s="abcd efgh";
		String str=s.replace(" " ,"");
		String s1="";
		String s2="";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				s1=s1+str.charAt(i);
			}
			else {
				s2=s2+str.charAt(i);
			}
		}
		System.out.println(s1+s2);//acegbdfh
		System.out.println("*****************");
		
		String[] str1=s.split(" ");	
		String reString=reverse(str1[1])+str1[0];
		System.out.println(reString);//hgfeabcd
		System.out.println("*****************");
		String r ="";
		String q ="";
		for(int i=0;i<str1.length;i++) {
			r=r+str1[i].charAt(0);
			q=q+str1[i].substring(1,str1[i].length());
		}
		System.out.println(r+q);//aebcdfgh
		System.out.println("*****************");
		String p="";
		for(int i=0;i<str.length();i++) {
			String p1=""+str.charAt(i);
			if(i%2==0) {
				p=p+p1.toUpperCase();
			}
			else {
				p=p+p1;
			}
		}
		System.out.println(p);//AbCdEfGh
}
	public static String reverse(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			str=s.charAt(i)+str;
		}
		return str;
	}
}
