package gfg_POTD;


import java.util.Scanner;
import java.util.Stack;

public class String_Pr_To_rp {

	
	private static int solve(int x, int y, String input) {
		//Created Stack of Characters
		Stack<Character>stk= new Stack<>();
		int size=input.length();
		int ans=0;
		int i=0;
		while(i<size) {
			//if Stack is Empty then simly add the current Element
			if(stk.isEmpty()) {
				stk.add(input.charAt(i));
			}//if curr char is 'r' and stack's top is 'p' then we found the match pop() it
			else if(input.charAt(i)=='r') {
				
				if(stk.peek()=='p') {
					
					
					if(y>x && i+1<size && input.charAt(i+1)=='p') { //for the test case prp or rpr 
						
							ans=ans+y;
							i=i+2;
						
					}else {
						
						stk.pop();
						ans=ans+x;//update the ans
					}
				}
				else {
					stk.add(input.charAt(i));
				}
			}//if curr char is 'p' and stack's top is 'r' then we found the match pop() it
			else if(input.charAt(i)=='p') {
				if(stk.peek()=='r') {
					if(y<x && i+1<size && input.charAt(i+1)=='r') {//for the test case prp or rpr 
						
						
						ans=ans+x;
						i=i+2;
					}else {
						stk.pop();
						ans=ans+y;//update the ans
					}
					
				}else {
					
					stk.pop();
					ans=ans+x;//update the ans
				}
			}else {
				stk.add(input.charAt(i));
				
			}
			i++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		String input=sc.next();
		System.out.println(solve(X,Y,input));
		sc.close();
	}

}
