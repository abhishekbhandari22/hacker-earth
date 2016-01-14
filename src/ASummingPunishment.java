import java.io.InputStreamReader;
import java.util.Scanner;


class ASummingPunishment {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N =sc.nextInt();
		int[] arr= new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		int Q=sc.nextInt();
		while(Q-->0){
			int start=sc.nextInt();
			int end=sc.nextInt();
			int total=0;
			for(int i=start-1;i<end;i++)
				total+=arr[i];
			System.out.println(total);
		}
		sc.close();
	}
}
