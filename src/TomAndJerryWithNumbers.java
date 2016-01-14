import java.io.InputStreamReader;
import java.util.Scanner;


class TomAndJerryWithNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T=sc.nextInt();
		while(T-->0){
			int N=sc.nextInt();
			int M1=sc.nextInt();
			int M2=sc.nextInt();
			boolean win=false;
			int max=Math.max(M1, M2);
			int min=Math.min(M1, M2);
			while((N>=M1)||(N>=M2)){
				if(!win){
					if(N>=max){
						N-=max;
						win=true;
					}
					else{
						N-=min;
						win=true;
					}
						
					
					}
				else{
					if(N>=max){
					N-=max;
					win=false;
					}
					else{
						N-=min;
						win=false;
					}
					
				}
			}
			if(win)
				System.out.println("1");
			else
				System.out.println("0");
		}
		sc.close();
	}
}
