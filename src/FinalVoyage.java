import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Math;

class FinalVoyage {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			int W=sc.nextInt();
			int[] wts=new int[N];
			int[] v=new int[N];
			for(int i=0;i<N;i++)
				wts[i]=sc.nextInt();
			for(int i=0;i<N;i++)
				v[i]=sc.nextInt();
			System.out.println(knapsack(N,W,wts,v));
			
		}//end of while
		sc.close();
	}
	
	static int knapsack(int N,int W,int[] wts,int[] v){
		int[][] M = new int[N+1][W+1];
		for(int i=1;i<=N;i++){
			for(int j=0;j<=W;j++){
				if(wts[i-1]<=j){
					M[i][j]=Math.max(M[i-1][j], v[i-1]+M[i-1][j-wts[i-1]]);
				}else
					M[i][j]=M[i-1][j];
			}
		}
		return M[N][W];
	}
}
