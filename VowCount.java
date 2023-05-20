package strings;

public class VowCount {
 public static void main(String[] args) {
	String str="aeiou";
	String s="developer";
	int vc=0;
	int cc=0;
	for(int i=0;i<s.length();i++) {
		if(str.indexOf(s.charAt(i))!=-1) {
			vc++;
		}
		else {
			cc++;
		}
	}
	System.out.println("vowels count: "+vc);
	System.out.println("consonent count: "+cc);
}
}
