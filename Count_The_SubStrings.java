package gfg_POTD;

import java.util.HashMap;
import java.util.Scanner;

public class Count_The_SubStrings {
	public static int countSubstring(String S) {
		// T.C : O(n^2)
		// int currlowerCount=0;
		// int currupperCount=0;
		// int ans=0;
		// for(int i=0;i<S.length();i++){
		// currlowerCount=0;
		// currupperCount=0;

		// for(int j=i;j<S.length();j++){
		// if(S.charAt(j)<'a'){
		// currupperCount++;

		// }else{
		// currlowerCount++;
		// }
		// if(currupperCount==currlowerCount){
		// ans++;
		// }
		// }

		// }

		// return ans;

		// T.C : O(n)
		// S.C : O(n)
		int sum = 0;
		int ans = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(0, 1);
		for (int i = 0; i < S.length(); i++) {
			int value;
			if (Character.isUpperCase(S.charAt(i))) {
				value = 1;
			} else {
				value = -1;
			}

			sum += value;
			if (hm.containsKey(sum)) {
				ans += hm.get(sum);
			}

			hm.put(sum, hm.getOrDefault(sum, 0) + 1);
		}

		return ans;

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		System.out.println(countSubstring(input));
	}

}
