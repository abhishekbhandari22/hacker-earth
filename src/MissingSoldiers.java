
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.InputStreamReader;
class MissingSoldiers {
	public static void main(String[] args){
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int N = scanner.nextInt();
		//long count=0L;
		//long MAX_VALUE=Long.MAX_VALUE;
		long x,y,d;
		Set<Long> bag = new HashSet<Long>(); 
		while(N-->0){
			x=scanner.nextLong();
			y=scanner.nextLong();
			d=scanner.nextLong();
			for(long i=x;i<=x+d;i++){
				bag.add(i);
				//System.out.println(i);
				}
		}//end of while
		System.out.println(bag.size());
		scanner.close();
	}//end of main
}
