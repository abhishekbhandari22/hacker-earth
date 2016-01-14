import java.io.*;
import java.util.Arrays;
class LittleDeepuAndArray {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		Arrays.sort(str);
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(str[i]);
		int M = Integer.parseInt(br.readLine());
		while(M-->0){
			int X = Integer.parseInt(br.readLine());
			int index = Arrays.binarySearch(arr, X);
			for(int i=index;i<N-1;i++)
				if(arr[i]==arr[i+1])
					index++;
			//while(index<N-1&&arr[index]==arr[index+1])
				//index++;
			for(int i=index;i<N;i++)
				arr[i]--;
		}//end of while
		for(int i=0;i<N;i++)
			System.out.print(arr[i]+" ");
		//Arrays.binarySearch(a, key)
	}//end of main
}
