/*
 * Works completely fine 
 * Created by Abhishek Bhandari 13/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
class MostFrequent {
	public static void main(String[] args){
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int N = scanner.nextInt();
		for(int i=0;i<N;i++){
			int key=scanner.nextInt();
			if(map.containsKey(key))
				map.replace(key, map.get(key)+1);
			else
				map.put(key, 1);
		}//end of for loop
		
		Set<Entry<Integer,Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr = set.iterator();
		Entry<Integer,Integer> entry=itr.next();
		int maxKey= entry.getKey();
		int maxCount=entry.getValue();
		while(itr.hasNext()){
			entry=itr.next();
			int key=entry.getKey();
			int count= entry.getValue();
			if(count==maxCount){
				if(maxKey>key)
					maxKey=key;
				continue;
			}
			if(count>maxCount){
				maxKey=key;
				maxCount=count;
			}
		}
		System.out.println(maxKey);
		scanner.close();
	}//end of main
}
