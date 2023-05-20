package strings;

import java.util.Scanner;

public class PartsOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println("enter the parts of the string");
		int n=sc.nextInt();
		
		int l=s.length();
		int r=l/n;
		int c=0;
		for(int i=0;i<s.length();i+=r) {
			String str="";
			c++;
			if(c<n) {
			str=s.substring(i,i+r);
			System.out.println(str);
			}
			else {
				str=s.substring(i);
				System.out.println(str);
				break;
			}
			
			
		}
	}

}
