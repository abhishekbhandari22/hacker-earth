/*
 * Works completely fine
 * Created by Abhishek Bhandari 3/1/2016
 */
import java.io.InputStreamReader;
import java.util.Scanner;


class DefuseTheBomb {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			String as=sc.next();
			String bs=sc.next();
			int al=as.length();
			int bl=bs.length();
			long b=Long.valueOf(bs);
			for(int i=0;i<=al-bl;i++){
				System.out.println(Long.valueOf(as.substring(i,i+bl))*b);
			}
		}
	}
}
