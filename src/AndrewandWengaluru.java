import java.io.*;
class AndrewandWengaluru {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		final long MAX=1000000007;
		while(T-->0){
			long ans=0;
			int N= Integer.parseInt(br.readLine());
			String str[]= br.readLine().split(" ");
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i]=Integer.parseInt(str[i]);
			int left_max[]=new int[N],right_max[]=new int[N];
			left_max[0]=arr[0];
			for(int i=1;i<N;i++){
				if(arr[i]>left_max[i-1])
					left_max[i]=arr[i];
				else
					left_max[i]=left_max[i-1];
			}
			right_max[N-1]=arr[N-1];
			for(int i=N-2;i>=0;i--){
				if(arr[i]>right_max[i+1])
					right_max[i]=arr[i];
				else
					right_max[i]=right_max[i+1];
			}
			long temp;
			for(int i=1;i<N-1;i++){
				temp=(Math.min(left_max[i],right_max[i])-arr[i]);
				if(temp>0)
					ans=(ans+temp)%MAX;
			}
			System.out.println(ans);
		}//end of while
	}
}
