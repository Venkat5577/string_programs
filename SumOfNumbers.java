package strings;
 import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch>='0'&&ch<='9'){
		        int n=Integer.parseInt(ch+"");
		        sum=sum+n;
		    }
		}
		System.out.println(sum);
	}

}
