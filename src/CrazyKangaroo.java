import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class CrazyKangaroo {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String st[] = br.readLine().split(" ");
			long A = Long.parseLong(st[0]);
			Long B = Long.parseLong(st[1]);
			Long M = Long.parseLong(st[2]);
			long count=0;
			if(A%M!=0)
				A=A+(M-A%M);
			while(A<=B){
				count++;
				A+=M;
			}
			System.out.println(count);
		}
		
	}//end of main
}
