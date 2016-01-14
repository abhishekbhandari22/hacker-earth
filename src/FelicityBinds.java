import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


class FelicityBinds {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int T =sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			int[] M = new int[N];
			int total=0;
			int[] F=new int[N];
			for(int i=0;i<N;i++)
				M[i]=sc.nextInt();
			for(int i=0;i<N;i++){
				F[i]=sc.nextInt();
			}
			Arrays.sort(M);
			Arrays.sort(F);
			for(int i=0;i<N;i++)
				total+=M[i]*F[i];
			System.out.println(total);
			
		}
		sc.close();
	}
}
