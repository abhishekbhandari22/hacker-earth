import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class LittleAshish {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int TC = Integer.parseInt(br.readLine());
		while(TC>0){
			String st[] = br.readLine().split(" ");
			int N = Integer.parseInt(st[0]);
			int X = Integer.parseInt(st[1]);
			br.readLine();
			
			if(N>X)
				sb.append("Lame husband\n");
			else if(N<X)
				sb.append("Bad husband\n");
			else
				sb.append("Perfect husband\n");
			TC--;
		}//end while
		System.out.println(sb);
	}
}
