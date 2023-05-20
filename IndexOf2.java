package strings;

public class IndexOf2 {
	public static void main(String[] args) {
		String s = "hello";
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			int c1=0;
			for (int j =0; j < c.length; j++) {

				if (s.indexOf(c[i]) == s.indexOf(c[j])){
					count++;
				}
			}
			for(int k=i;k>=0;k--){
			    if (s.indexOf(c[i]) == s.indexOf(c[k])){
			        c1++;
			    }
			}
	
			if(c1<=1) {
				System.out.println(s.charAt(i)+" occurs "+count+" times");
			}

		}
	}

}












//for (int j = 0, l = 0; j < s.length(); j++) {
//if (s.charAt(i) == s.charAt(j)) {
//	a[l] = j;
//	l++;
//}
//}
//	for(int j=0;j<a.length;j++){
//System.out.println(a[j]);
//}
