package strings;

import java.util.Stack;

public class Symbols {

	public static void main(String[] args) {
		String s="(){(}[]";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='{'||ch=='{'||ch=='[') {
				st.push(ch);
			}
			else if(!st.empty()&&((ch==']'&&st.peek()=='[')||(ch=='}'&&st.peek()=='{')||(ch==')'&&st.peek()=='('))) {
				st.pop();
			}else {
				st.push(ch);
			}
		}
		if(st.empty()) {
			System.out.println("balanced String");
		}
		else {
			System.out.println("not palanced String");
		}
	}

}
