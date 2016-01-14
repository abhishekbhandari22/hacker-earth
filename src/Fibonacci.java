import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		long f[]=new long[N];
		f[0]=1;f[1]=1;
		for(int i=2;i<N;i++)
			f[i]=f[i-2]+f[i-1];
		System.out.println(f[N-1]);
		in.close();
	}
}
