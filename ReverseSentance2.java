package strings;
 import java.util.Scanner;
public class ReverseSentance2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String[] s1=s.split(" ");
		String revString="";
		for(int i=0;i<s1.length;i++) {
			revString=" "+s1[i]+revString;
		}
		System.out.println(revString.trim());
		
	}

}
