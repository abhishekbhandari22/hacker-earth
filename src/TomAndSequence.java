import java.io.InputStreamReader;
import java.util.Scanner;


class TomAndSequence {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		long MOD=1000000007L;
		while(T-->0){
			int n = sc.nextInt();
			long a=2;
			for(int i=1;i<=n;i++)
				a=((a*(2*i-1))%MOD);
			System.out.println(a);
		}//end of while
		sc.close();
	}
}
