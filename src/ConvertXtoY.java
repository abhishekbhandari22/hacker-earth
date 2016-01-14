import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class ConvertXtoY {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String str[]= br.readLine().split(" ");
			long x = Long.parseLong(str[0]);
			long y = Long.parseLong(str[1]);
			System.out.println(minSwap(x,y));
		}
		
	}//end of main
	private static int minSwap(long x,long y){
		long temp=x^y;
		if(temp==0)
			return 0;
		int swap=0;
		while(temp!=0){
			if((temp&1)!=0)
				swap++;
			temp=temp>>1;
		}
		return swap;
	}
}
