import java.io.*;
import java.util.Arrays;

class WitchAndPrisoners {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int T = Integer.parseInt(br.readLine());
		long[] arr= new long[3];
		while(T-->0){
			String[] str=br.readLine().split(" ");
			arr[0]=Long.parseLong(str[0]);
			arr[1]=Long.parseLong(str[1]);
			arr[2]=Long.parseLong(str[2]);
			
			Arrays.sort(arr);
			System.out.println(Math.max(arr[2]-arr[1], arr[1]-arr[0])-1);
		}
	}
}
