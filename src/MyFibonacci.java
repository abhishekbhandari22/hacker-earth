import java.io.InputStreamReader;
import java.util.Scanner;


class MyFibonacci {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int a = sc.nextInt();
		int b= sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		if(N==1){
			System.out.println(a);
			return;
		}
		if(N==2){
			System.out.println(b);
			return;
		}
		int[] arr = new int[N];
		arr[0]=a;
		arr[1]=b;
		for(int i=2;i<N;i++)
			arr[i]=arr[i-1]+arr[i-2];
		
		System.out.println(arr[N-1]);
			
	}
}
