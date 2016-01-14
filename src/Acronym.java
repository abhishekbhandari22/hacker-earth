import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
class Acronym {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Deque<String> bag = new LinkedList<String>();
		//String str[]= br.readLine().split(" ");
		for(int i=0;i<K;i++)
			bag.add(br.readLine());
		int N = Integer.parseInt(br.readLine());
		String str[]= br.readLine().split(" ");
		int l;
		for(l=N-1;l>=0;l--)
			if(!bag.contains(str[l]))
				break;
		for(int i=0;i<l;i++){
			if(bag.contains(str[i]))
				continue;
			else{
				System.out.print(str[i].toUpperCase().charAt(0)+".");
			}
			//if(!bag.contains(str[N-1]))
				
		}//end of for
		System.out.print(str[l].toUpperCase().charAt(0));
	}//end of main
}
