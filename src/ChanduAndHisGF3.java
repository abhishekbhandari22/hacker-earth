import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class ChanduAndHisGF3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			String[] arr = new String[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.next();
			Arrays.sort(arr,Collections.reverseOrder());
			for(String s:arr)
				System.out.print(s+" ");
			System.out.println();
		}
		sc.close();
	}//end of main
}
