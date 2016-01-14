import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class MonkAtTheGraphFactory {
	public static void main(String[] args)throws IOException{

		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		int total=0;
		for(int i=0;i<N;i++)
			total+=sc.nextInt();
		if(total==(2*(N-1)))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}
