package strings;

public class Demo2 {

	public static void main(String[] args) {
		String s="abc3d5k13hi2j";
		String str="";
		
		for(int i=0;i<s.length();i++) {
			String n="";
			int l=i;
			for(int j=i;j<s.length();j++) {
				char ch=s.charAt(j);
				if(ch>='0'&&ch<='9') {
					n=n+ch;
					i=j;
				}
				else {
					break;
				}
			}
				if(n!="") {
					int x=Integer.parseInt(n);
					for(int k=1;k<x;k++) {
						str=str+s.charAt(l-1);
					}
				}
				else {
					str=str+s.charAt(l);
				}
			}
		System.out.println(str);

	}

}
