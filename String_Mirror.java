package gfg_POTD;
import java.util.*;

public class String_Mirror {
	
	public static void stringMirror(String input) {
		String ans= new String();
		ans = ans+input.charAt(0);
		for(int i=1;i<input.length();i++) {
			if(ans.charAt(i-1) >input.charAt(i) || (i>1 && input.charAt(i-1)==input.charAt(i)) ) {
				ans = ans+input.charAt(i);
			}else {
				break;
			}
		}
		
		for(int i=ans.length()-1;i>=0;i--) {
			ans+=ans.charAt(i);
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		String input = new String();
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		stringMirror(input);

	}
//	
}
