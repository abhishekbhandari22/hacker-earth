/*
 * Works completely fine 
 * Created By Abhishek Bhandari, 14/01/2016
  */
import java.util.Scanner;
import java.io.InputStreamReader;

class CountCarryProblem {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		while(N-->0){
			String a = sc.next();
			String b = sc.next();
			if(a.length()<b.length())
				while((a.length()<b.length()))
					a="0"+a;
			else
				while(b.length()<a.length())
					b="0"+b;
			
			int count =0;
			for(int i=0;i<a.length();i++){
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
