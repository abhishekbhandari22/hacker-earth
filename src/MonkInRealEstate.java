import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


class MonkInRealEstate {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			HashSet<Integer> set = new HashSet<Integer>();
			int N = sc.nextInt();
			for(int i =0;i<N;i++){
				set.add(sc.nextInt());
				set.add(sc.nextInt());
			}
			System.out.println(set.size());
		}//end of while
		sc.close();
	}
}
