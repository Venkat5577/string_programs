package strings;

import java.util.Scanner;

public class ReverseSentance3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String[] s1=s.split(" ");
		String revString="";
		for(int i=0;i<s1.length;i++) {
			revString=revString+reverse(s1[i])+" ";
		}
		System.out.println(revString.trim());
	}
	
	
	public static String reverse(String s) {
		String revString="";
		for(int i=0;i<s.length();i++) {
			revString=s.charAt(i)+revString;
		}
		return revString;
	}

}
