import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

class MonkandTime {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=0;
		int N = Integer.parseInt(br.readLine());
		String st1[]= br.readLine().split(" ");
		String st2[]= br.readLine().split(" ");
		Queue<Integer> S1 = new LinkedList<Integer>();
		Queue<Integer> S2 = new LinkedList<Integer>();
		for(int i=0;i<N;i++){
			S1.add(Integer.parseInt(st1[i]));
			S2.add(Integer.parseInt(st2[i]));
		}
		while(!S2.isEmpty()){
			if(S1.peek()==S2.peek()){
				S1.remove();
				S2.remove();
				T++;
			}else{
				S1.add(S1.remove());
				T++;
			}
		}//end while
		System.out.println(T);
	}//end main
	
}
