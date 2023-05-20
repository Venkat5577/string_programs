package strings;

public class longestPrefix {

	public static void main(String[] args) {
	String[] a= {"geeksforgeeks","geeks","gk776yjfgc","gekerdfbdfb"};
	int min=a[0].length();
	int n=-1;
	for(int i=0;i<a.length;i++) {
		if(a[i].length()<min) {
			min=a[i].length();
			n=i;
		}
	}
		String str=a[n];
		boolean b=false;
		for(int i=0;i<a.length;i++) {
			String str1="";
			for(int j=0;j<min;j++) {
				
				if(a[i].charAt(j)==a[n].charAt(j)) {
					str=str+a[i].charAt(j);
				}
				else {
					break;
				}
				if(str1.length()<str.length()) {
					str=str1;
				}
			}
			
		}
			System.out.println(str);
	}

}
