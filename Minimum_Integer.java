package gfg_POTD;

import java.util.Scanner;

public class Minimum_Integer {

	public static int minimumInteger(int N, int[] A) {
        // code here
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if((long)((long)N*(long)A[i])>=sum && A[i]<ans){
                ans=A[i];
            }
        }
        
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A[]= {1,2,3,4,5};
		int N = A.length;
		
		System.out.println(minimumInteger(N, A));

	}

}
