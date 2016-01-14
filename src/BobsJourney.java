import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
class BobsJourney {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		
		while(T-->0){
			int N = Integer.parseInt(in.nextLine());
			boolean rem = true;
			HashMap<Character,Integer> hm = new HashMap<Character,Integer>(N);
			for(int i=0;i<N;i++){
				char city = in.nextLine().charAt(0);
				if(hm.containsKey(city)){
					hm.replace(city, hm.get(city)+1);
				}else
					hm.put(city, 1);
			}
			Set<Entry<Character, Integer>> set = hm.entrySet();
			Iterator<Entry<Character, Integer>> itr = set.iterator();
				
			while(itr.hasNext()){
				Map.Entry<Character, Integer> me = (Map.Entry<Character, Integer>)itr.next();
				if(me.getValue()>1){
					rem=false;
					break;
				}
					
			}
			if(rem)
				System.out.println("Yes");
			else
				System.out.println("No");
		}//end of while
		in.close();
	}
}
