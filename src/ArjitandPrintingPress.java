import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
class ArjitandPrintingPress {
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(T-->0){
			Deque<Character> W = new LinkedList<Character>();
			char w[]=br.readLine().toCharArray();
			Deque<Character> R = new LinkedList<Character>();
			char r[]=br.readLine().toCharArray();
			Arrays.sort(r);
			for(int i=0;i<w.length;i++){
				W.addLast(w[i]);
			}
			for(int i=0;i<r.length;i++){
				R.addLast(r[i]);
			}
			
			while((!W.isEmpty())&&(!R.isEmpty())){
				if(W.peekFirst().compareTo(R.peekFirst())>0){
					W.removeFirst();
					sb.append(R.removeFirst());
				}else 
					sb.append(W.removeFirst());
				}//end inner while
			while(!W.isEmpty()){
				sb.append(W.removeFirst());
			}
			
			sb.append("\n");
		}//end of while
		System.out.println(sb);
	}
}
