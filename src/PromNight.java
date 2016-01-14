import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class PromNight {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T>0){
			boolean possible = true;
			String st[] = br.readLine().split(" ");
			int M = Integer.parseInt(st[0]);
			int N = Integer.parseInt(st[1]);
			String boy[] = br.readLine().split(" ");
			String girl[]=br.readLine().split(" ");
			if(M>N){
				sb.append("NO\n");
				}
			else
			{
				Arrays.sort(boy);
				Arrays.sort(girl);
				for(int i=0;i<M;i++){
					if(!(boy[i].compareTo(girl[i])>0)){
						possible=false;
						break; //break out of for loop and go to while to test for other case
					}
				}//end of for
				if(possible==true)
					sb.append("YES\n");
				else
					sb.append("NO\n");
			}//end else
			T--;
		}//end while
		System.out.println(sb);
	}//end main
}
