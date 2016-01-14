import java.io.InputStreamReader;
import java.util.Scanner;


class TomAndCoins {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int a= sc.nextInt();
			int k= sc.nextInt();
			int n=sc.nextInt();
			int total= a+(n-1)*k;
			System.out.println(total);
		}
		sc.close();
	}
}
