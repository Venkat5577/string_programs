package strings;

public class SumOfStrNum {

	public static void main(String[] args) {
		String s="10,2,3,-4,*10";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			String str="";
			for(int j=i;j<s.length();j++) {
				char ch=s.charAt(j);
				if((ch>=48&&ch<=57)||ch=='-'||ch=='*'||ch=='/') {
					str=str+ch;
					i=j;
				}
				else {
					break;
				}
			}
			if(str!="") {
				if(str.charAt(0)=='*') {
					sum=sum*Integer.parseInt(str.substring(1));
				}
				else if(str.charAt(0)=='/') {
					sum=sum/Integer.parseInt(str.substring(1));
				}
				else {
					sum=sum+Integer.parseInt(str);
				}
			}
		}
		System.out.println(sum);
	}

}
