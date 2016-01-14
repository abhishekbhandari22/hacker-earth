import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
class ProjectTeam {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(T-->0){
			String st[] = br.readLine().split(" ");
			int N = Integer.parseInt(st[0]);
			int arr[] = new int[N];
			for(int i=1;i<=N;i++){
				arr[i-1]=Integer.parseInt(st[i]);
			}
			Arrays.sort(arr);
			int max=0,min=arr[0]+arr[N-1];
			int l=0,r=N-1;
			while(l<r){
				int sum = arr[l]+arr[r];
				if(sum>max)
					max=sum;
				if(sum<min)
					min=sum;
				l++;
				r--;
			}
			sb.append(max-min+"\n");
		}//end of while
		System.out.println(sb);
	}//end of main
}
