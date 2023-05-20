package strings;

public class StartWithVowel {

	public static void main(String[] args) {
		String s="This is a class and my name is venkat";
		String st="aeiouAEIOU";
		String[] s1=s.split(" ");
		String str1="";
		for(int i=0;i<s1.length;i++) {
			if((st.indexOf(s1[i].charAt(0)+""))!=-1) {
				str1=str1+s1[i]+" ";
			}
		}
		System.out.println(str1);
	}

}
