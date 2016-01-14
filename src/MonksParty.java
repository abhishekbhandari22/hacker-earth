import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class MonksParty {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			HashSet<String> set = new HashSet<String>();
			int N = sc.nextInt();
			for(int i=0;i<N;i++)
				set.add(sc.next());
			List<String> list = new LinkedList<String>();
			list.addAll(set);
			Collections.sort(list);
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}//end of while
		sc.close();
	}
}
