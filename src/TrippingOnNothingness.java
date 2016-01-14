import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class TrippingOnNothingness {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int S = sc.nextInt();
		int Q = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<Q;i++){
			int q=sc.nextInt();
			int gcd=findGCD(S,q);
			if(list.contains(gcd))
				System.out.println("-1");
			else{
				System.out.println(gcd);
				list.add(gcd);
			}
		}
		sc.close();
	}
	private static int findGCD(int number1, int number2) { 
		//base case 
		if(number2 == 0){ 
			return number1; 
			} 
		return findGCD(number2, number1%number2); }
	
}
