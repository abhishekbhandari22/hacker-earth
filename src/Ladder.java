import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Ladder {
	static long mod = 1000000007;
	static int max = 1000005;
	static long f[]= new long[max];
	static long f1[] = new long[max];
		public static void main(String[] arg) throws IOException {
			f[0]=0; 
			f[1]=0; 
			f[2]=1; 
			f[3]=0; 
			f[4]=1; 
			f[5]=1;

			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String st[] = br.readLine().split(" ");
			long T = Long.parseLong(st[0]);
			long N = Long.parseLong(st[1]);
			for(int i=6;i<=N;i++)
				f[i]=(f[i-2]+f[i-5])%mod;
			while(T>0){
				st=br.readLine().split(" ");
				int cur = Integer.parseInt(st[0]);
				int k = Integer.parseInt(st[1]);
				if(k>cur||k==5)
					System.out.println(f[cur]);
				else if (k==cur)
					System.out.println((f[cur]+1)%mod);
				else{
					for(int i=0;i<=k;i++)
						f1[i]=f[i];
					f1[k]=(f1[k]+1)%mod;
					for(int i=k+1;i<=cur;i++)
						f1[i]=(f1[i-2]+f[i-5]+f[i-k])%mod;
					System.out.println(f1[cur]);
					}
				T--;
			}//end of while
		
	}

}
