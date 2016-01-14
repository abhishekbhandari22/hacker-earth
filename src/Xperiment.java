import java.math.BigInteger;
import java.util.Scanner;
class Xperiment {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		long  mod = 1000000;
		int T = Integer.parseInt(in.nextLine());
		//StringBuilder sb = new StringBuilder();
		while(T-->0){
			int N = Integer.parseInt(in.nextLine());
			if(N==1)
			{
				System.out.println(1);
				continue;
			}else
			{
				//long op[] = new long[N];
				BigInteger prime = BigInteger.valueOf(2);
				System.out.print(2+" ");
				//sb.append(2+" ");
				for(int i=1;i<N;i++){
					prime = prime.nextProbablePrime();
					System.out.print(prime.longValue()%mod+" ");
				}
				System.out.println();
			}
			
		}//end while
		//System.out.println(sb);
		in.close();
	}
}
