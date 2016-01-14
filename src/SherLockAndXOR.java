import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class SherLockAndXOR {
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			String str[]= br.readLine().split(" ");
			int arr[]= new int[N];
			for(int i=0;i<N;i++)
				arr[i]=Integer.parseInt(str[i]);
			
			int countEven=0;
			int countOdd=0;
			for(int i=0;i<N;i++)
				if((arr[i]&1)==0)
					countEven++;
				else
					countOdd++;
			//System.out.println(countOdd+"\n"+countEven);
			System.out.println(countEven*countOdd);
		}
					
	}
}
