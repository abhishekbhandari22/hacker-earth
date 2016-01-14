import java.io.InputStreamReader;
import java.util.Scanner;


class MindPalaces {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int N=sc.nextInt();
		int M =sc.nextInt();
		long[][] mat=new long[N][M];
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				mat[i][j]=sc.nextLong();
		
		int Q=sc.nextInt();
		while(Q-->0){
			long item=sc.nextLong();
			boolean found=false;
			int i,mid=0;
			for(i=0;i<N;i++){
				
				int lower =0,upper=M-1;
				while(lower<upper)
				{	
					mid=lower+(upper-lower)/2;
					long m=mat[i][mid];
					if(m==item){
						found=true;
						break;
					}else{
						if(item>m){
							lower=mid+1;
						}else
							upper=mid;
					}
				}
				if(found==true)
					break;
			}
			if(found)
				System.out.println(i+" "+mid);
			else
				System.out.println(-1+" "+ -1);
			
		}//end of while
		sc.close();
	}
	
}
