import java.io.InputStreamReader;
import java.util.Scanner;


class PallindromicNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int A = sc.nextInt();
			int B = sc.nextInt();
			int count =0;
			for(int i=A;i<=B;i++){
				if(isPallindrome(i))
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
	private static boolean isPallindrome(int num){
		String str= String.valueOf(num);
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		if(str.equals(sb.toString()))
			return true;
		return false;
	}
}
