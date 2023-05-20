package strings;

public class Reverse {
	public static void main(String[] args) {
		String s="venkatamana";
//		for(int i=s.length()-1;i>=0;i--) {// using charAt() method
//			System.out.print(s.charAt(i));
//		}
		char[] c=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {// using charAt() method
		System.out.print(c[i]);
		}
	}

}
