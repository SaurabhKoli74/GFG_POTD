package gfg_POTD;


import java.util.Scanner;

public class FrogsAndJumps {
	
	//T.C: O(n*log(leaves))
	//S.C: O(leaves)
	public static int unvisitedLeaves(int n, int leaves, int[] frogs) {
		boolean visited[]=new boolean[leaves+1];
		int ans=0;
		for(int i=0;i<n;i++) {
		    if(frogs[i]<=leaves && visited[frogs[i]]==true){
		        continue;
		    }
			if((leaves%frogs[i])==0) {
				int size=leaves/frogs[i];
				int j=1;
				while(j<=size) {
					visited[frogs[i]*j]=true;
					j++;
				}
			}
			else if(frogs[i]<=leaves){
			    int size=leaves/frogs[i];
			    int j=1;
			    while(j<=size){
			        visited[frogs[i]*j]=true;
			        j++;
			    }
			}
		}
		
		for(int i=1;i<visited.length;i++) {
			if(!visited[i]) {
				ans++;
			}
            // System.out.println(visited[i]);
		}
		return ans;
		
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int leaves=sc.nextInt();
		int frogs[]=new int[N];
		for(int i=0;i<N;i++) {
			frogs[i]=sc.nextInt();
			
		}
		System.out.println(unvisitedLeaves(N,leaves,frogs));
		sc.close();
		
	}

	

}
