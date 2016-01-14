/*
 * Works completely fine 
 * Created by Abhishek Bhandari 14/12/2015
 * 
 * */
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class CoachAndMessi {
	public static void main(String[] args){
		/*File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc= new Scanner(file);*/
		Scanner sc = new Scanner(new InputStreamReader(System.in));
			BigInteger MOD= new BigInteger("1000000007");
			int T=sc.nextInt();
			while(T-->0){
				String str=sc.next();
				BigInteger x= new BigInteger(str);
				BigInteger y= new BigInteger(sc.next());
				//BigInteger res = new BigInteger(str);
				x=x.modPow(y, MOD);
				
				System.out.println(x);
			}
			
			sc.close();
		/*}catch(FileNotFoundException f){
			f.printStackTrace();
		}*/
		
		
	}
}
