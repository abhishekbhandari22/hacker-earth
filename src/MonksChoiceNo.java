import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class MonksChoiceNo {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int total=0;
			String str[]= br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[1]);
			//int arr[]= new int[N];
			int arrK[]= new int[N];
			str= br.readLine().split(" ");
			for(int i=0;i<N;i++){
				arrK[i]=noOfOne(Integer.parseInt(str[i]));
			}
			Arrays.sort(arrK);
			
			for(int i=N-1;i>=N-K;i--)
				total+=arrK[i];
			System.out.println(total);
		}//end of while
	}//end of main
	private static int noOfOne(int x){
		int count=0;
		//int shift=0;
		while(x>0){
			if((x&1)!=0)
				count++;
			//shift++;
			x=x>>1;
		}
		return count;
	}
}
