import java.io.*;
class NaviAndFriend {
	static boolean[][] keep;
	static int[] W;
	static int[] V;
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String[] str;
			int N = Integer.parseInt(br.readLine());
			for(int i=0;i<N;i++){
				str = br.readLine().split(" ");
				V[i]=Integer.parseInt(str[0]);
				W[i]=Integer.parseInt(str[1]);
				
			}
			str=br.readLine().split(" ");
			int Wmax= Integer.parseInt(str[0]);
			int C=Integer.parseInt(str[1]);
			knapsack(N,Wmax,W,V);
		}//end of while
		br.close();
	}
	
	static int knapsack(int n,int W,int[] w, int[] v ){
		int[][] m= new int[n+1][W+1];
		keep=new boolean[n+1][W+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=W;j++){
				if((w[i-1]<=j)&&(v[i-1]+m[i-1][j-w[i-1]]>m[-1][j])){
					keep[i][j]=true;
					m[i][j]=v[i-1]+m[i-1][j-w[i-1]];
				}else{
					m[i][j]=m[i-1][j];
					keep[i][j]=false;
				}
			}
		}
		return 1;
	}
}
