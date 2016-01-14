import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class TheRiseOfWeirdThings {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
			arr[i]=in.nextInt();
		//String str[] = in.nextLine().split(" ");
		Arrays.sort(arr);
		
		Queue<Integer> zombie = new LinkedList<Integer>();
		Queue<Integer> vampire = new LinkedList<Integer>();
		int temp;
		
		for(int i=0;i<N;i++){
			temp=arr[i];
			if((temp&1)!=0)
				vampire.add(temp);
			else
				zombie.add(temp);
		}
		int total =0;
		while(!zombie.isEmpty()){
			temp=zombie.remove();
			System.out.print(temp+" ");
			total+=temp;
		}
		System.out.print(total+" ");
		total=0;
		while(!vampire.isEmpty()){
			temp=vampire.remove();
			System.out.print(temp+" ");
			total+=temp;
		}
		System.out.print(total+" ");
		in.close();
	}//end of main
}
