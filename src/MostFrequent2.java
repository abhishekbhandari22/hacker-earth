/*
 * Works completely fine 
 * Created by Abhishek Bhandari 13/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


class MostFrequent2 {
	static class number implements Comparable<number>{
		int key;
		int count;
		public number(int key){
			this.key=key;
			this.count=0;
		}
		
		@Override
		public int compareTo(number o) {
			// TODO Auto-generated method stub
			if(this.count==o.count)
				return this.key-o.key;
			return o.count-this.count;
		}
		
	}//end of class number
	
	public static void main(String[] args){
		Scanner scanner= new Scanner(new InputStreamReader(System.in));
		int N = scanner.nextInt();
		Vector<number> v = new Vector<number>();
		for(int i=0;i<N;i++){
			boolean jump = false;
			int key = scanner.nextInt();
			for(int j=0;j<v.size();j++){
				number numb =v.get(j);
				if(numb.key==key){
					numb.count++;
					jump=true;
					break;
				}
			}//end of inner loop
			if(!jump){
				v.add(new number(key));
			}
		}//end of outer loop
		
		Collections.sort(v);
		System.out.println(v.get(0).key);
		scanner.close();
	}//end of main
}

