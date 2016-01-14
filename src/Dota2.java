import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Dota2 {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str[]= in.nextLine().split(" ");
		int Ms= Integer.parseInt(str[0]);
		int Mt= Integer.parseInt(str[1]);
		int Lt=Integer.parseInt(str[2]);
		int N = Integer.parseInt(in.nextLine());
		str= in.nextLine().split(" ");
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<N;i++)
			q.add(Integer.parseInt(str[i]));
		
		int total=0;
		while(!q.isEmpty()){
			if(q.size()==1){
				total+=Ms;
				q.remove();
			}
			else{
				int top = q.remove();
				if((q.peek()-top+1)>Lt)
					total+=Ms;
				else{
					while(!q.isEmpty()&&((q.peek()-top+1)<=Lt)){
						q.remove();
					}//end of while
					total+=Mt;
				}
			}//end of else
		}//end of while
			
		System.out.println(total);
		
		in.close();
	}//end of main
}
