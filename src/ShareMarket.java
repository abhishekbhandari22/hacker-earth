/*
 * Works completely fine
 * Created by Abhishek Bhandari 4/1/2016
 */
import java.io.InputStreamReader;
import java.util.Scanner;



class ShareMarket {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T=sc.nextInt();
		while(T-->0){
			long ans=0;
			int N = sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			int i=0;
			while(i<N){
				int max=0;
				for(int j=i;j<N;j++){
					if(arr[j]>max)
						max=arr[j];
				}
				long r=0,c=0;
				while(arr[i]!=max){
					r+=arr[i];
					c++;
					i++;
				}
				ans+=max*c-r;	
				i++;	
			}//end of outer while
			System.out.println(ans);
		}
		sc.close();
	}
}
