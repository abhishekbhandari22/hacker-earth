import java.util.Arrays;
import java.util.Scanner;
class GottaCatchemAll {
	public static void main(String[] arg){
		final int Max = Integer.MAX_VALUE;
		Scanner in = new Scanner(System.in);
		int K = Integer.parseInt(in.nextLine());
		String s[] = in.nextLine().split(" ");
		Arrays.sort(s);
		int max=0;
		int arr[] = new int[K];
		for(int i=0;i<K;i++)
			arr[i]=Integer.parseInt(s[K-1-i]);
		for(int i=0;i<K;i++){
			if((i+arr[i]+2)%Max>max)
				max=(i+arr[i]+2)%Max;
		}
		System.out.println(max);
		in.close();
	}
}
