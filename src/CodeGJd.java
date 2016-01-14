import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


class CodeGJd {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			int arr[]= new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			Stack<Integer> st = new Stack<Integer>();
			for(int i=0;i<N;i++)
				st.add(arr[i]);
			int time=0;
			while(st.size()>1){
				int t1=st.pop();
				int t2=st.pop();
				time+=t1+t2;
				st.add(t1+t2);
			}
			System.out.println(time);
		}//end of while
		sc.close();
	}
}
