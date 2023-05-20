package strings;

import java.util.Scanner;

public class ReverseSentance1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//java css html input
		String revString = "";
		for (int i = 0; i < s.length(); i++) {
			revString = s.charAt(i) + revString;
		}
		System.out.println(revString); //lmth ssc avaj

	}

}
