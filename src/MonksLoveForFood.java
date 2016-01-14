import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


class MonksLoveForFood {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int Q =sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		
		while(Q-->0){
			int q=sc.nextInt();
			if(q==1){
				if(stack.isEmpty()){
					System.out.println("No Food");
					continue;
					}
				System.out.println(stack.pop());
				continue;
			}
			stack.push(sc.nextInt());
		}
		sc.close();
	}
}
