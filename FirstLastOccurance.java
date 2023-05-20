package strings;

public class FirstLastOccurance {

	public static void main(String[] args) {
		String s="developer";
		int fi=-1;
		int li=-1;
		char ele='e';
			for(int i=0,j=s.length()-1;i<s.length();i++,j--) {
				if(s.charAt(i)==ele||s.charAt(j)==ele) {
					fi=j;
					li=i;
					
				}
				
			}
			System.out.println("first occurance: "+fi);
			System.out.println("last occurance: "+li);

	}

}
