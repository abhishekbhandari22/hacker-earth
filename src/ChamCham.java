import java.io.InputStreamReader;
import java.util.Scanner;


class ChamCham {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			Long N = sc.nextLong();
			Long sum =N*(N+1)/2;
			System.out.println(N+1);
			System.out.println(sum);
			for(long i=0;i<=N;i++)
				System.out.print(i+" ");
		}//end of while
		sc.close();
	}
}
