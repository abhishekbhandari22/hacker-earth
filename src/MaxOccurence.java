/*
 * Works completely fine 
 * Created by Abhishek Bhandari 20/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


class MaxOccurence {
	static class Alphabet implements Comparable<Alphabet>{
		char lab;
		int count;
		public Alphabet(char lab){
			this.lab=lab;
			this.count=1;
		}
		
		@Override
		public int compareTo(Alphabet o) {
			// TODO Auto-generated method stub
			if(this.count==o.count)
				return this.lab-o.lab;
			return o.count-this.count;
		}
		
	}//end of class number
	
	public static void main(String[] args){
		Scanner scanner= new Scanner(new InputStreamReader(System.in));
		char[] arr = scanner.nextLine().toCharArray();
		Vector<Alphabet> v = new Vector<Alphabet>();
		for(int i=0;i<arr.length;i++){
			char temp = arr[i];
			boolean jump = false;
			
			for(int j=0;j<v.size();j++){
				Alphabet alpha =v.get(j);
				if(alpha.lab==temp){
					alpha.count++;
					jump=true;
					break;
				}
			}//end of inner loop
			if(!jump){
				v.add(new Alphabet(temp));
			}
		}//end of outer loop
		
		Collections.sort(v);
		System.out.println(v.get(0).lab +" "+v.get(0).count);
		scanner.close();
	}//end of main
}

