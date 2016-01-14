/*
 * Works completely fine
 * Created by Abhishek Bhandari 5/1/2016
 */
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


class RosesLove {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int N =sc.nextInt();
			int[] arr=new int[N];
			boolean wasVisited[]= new boolean[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			Stack<Integer> st = new Stack<Integer>();
			wasVisited[0]=true;
			boolean found=false;
			if(arr[0]==-1){
				System.out.println("Win");
				continue;
			}
			if((arr[0]>=0)&&arr[0]<N)
				st.add(arr[0]);
			while(!st.empty()){
				int top=st.pop();
				if(top==-1){
					found=true;
					break;
				}
					
				if((top>=0)&&(top<N)&&(!wasVisited[top])){
					st.add(arr[top]);
					wasVisited[top]=true;
				}
					
			}
			if(found)
				System.out.println("Win");
			else
				System.out.println("Lose");
		}
		sc.close();
	}
}
