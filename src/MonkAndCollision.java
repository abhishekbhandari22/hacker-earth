import java.util.Hashtable;
import java.util.Scanner;
class MonkAndCollision {	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		while(T-->0){
			Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
			int N = Integer.parseInt(in.nextLine());
			int collision=0;
			String str[] = in.nextLine().split(" ");
			for(int i=0;i<N;i++){
				int temp=Integer.parseInt(str[i])%10;
				if(ht.containsKey(temp))
						collision++;
				else{
					ht.put(temp, 1);
				}
			}
			System.out.println(collision);
		}//end of while
		in.close();
		}
}
