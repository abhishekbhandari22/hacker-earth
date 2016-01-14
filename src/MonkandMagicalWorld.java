import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
class MonkandMagicalWorld {
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	while(T-->0){
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);
		int arrK[]= new int[N];
		str= br.readLine().split(" ");
		for(int i=0;i<N;i++)
			arrK[i]=Integer.parseInt(str[i]);
		int arrC[]= new int[M];
		str= br.readLine().split(" ");
		for(int i=0;i<M;i++)
			arrC[i]=Integer.parseInt(str[i]);
		int arrZ[]= new int[M];
		str=br.readLine().split(" ");
		for(int i=0;i<M;i++)
			arrZ[i]=Integer.parseInt(str[i]);
		int prize[]=new int[N];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(gcd(arrK[i],arrC[j])!=1)
					prize[i]+=arrZ[j];
			}
		}//end of outer for
		Arrays.sort(prize);
		int total=0;
		for(int i=N-1;i>=N-K;i--)
			total+=prize[i];
		System.out.println(total);
		}//end of while
	}//end of main
	
	private static int gcd(int a, int b){
		int min = Math.min(a, b);
		
		for(int k = min; k>1; k--){
			if(a%k==0 && b%k==0)
				return k;	//since k divides both a and b it is gcd
		}
		return 1; 	//if there is no common divisor return 1
	}
}
