import java.io.InputStreamReader;
import java.util.Scanner;


class CountCarryProblem {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		while(N-->0){
			String a = sc.next();
			while((a.length()<3))
				a="0"+a;
			String b = sc.next();
			while(b.length()<3)
				b="0"+b;
			int count =0;
			for(int i=0;i<3;i++){
				int ai=Integer.parseInt(a.substring(i, i+1));
				int bi=Integer.parseInt(b.substring(i, i+1));
				if((ai+bi)>9)
					count++;
			}
			if(count==0)
				System.out.println("No carry operation");
			else if(count==1)
				System.out.println("1 carry operation");
			else System.out.println(count+ " carry operations");
		}
	}
}
