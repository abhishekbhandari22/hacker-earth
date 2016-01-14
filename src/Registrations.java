import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Registrations {
	public static void main(String[] args){
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc= new Scanner(file);
			//Scanner sc= new Scanner(new InputStreamReader(System.in));
			int N= sc.nextInt();
			BigInteger big1 = sc.nextBigInteger();
			
			for(int i=0;i<N-1;i++){
				big1.add(sc.nextBigInteger());
			}
			String str=big1.toString();
			while(str.length()!=1){
				int count=0;
			for(int i=0;i<str.length();i++){
				count+=Integer.parseInt(str.substring(i, i+1));
			}
			str=String.valueOf(count);
			}
			System.out.println(str);
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		/*
			while(N-->0){
			
			String str= sc.next();
			while(str.length()!=1){
				int count=0;
				for(int i=0;i<str.length();i++){
					count+=Integer.parseInt(str.substring(i, i+1));
				}
				str=String.valueOf(count);
			}
			System.out.println(str);
		}//end of while*/
		
	}
}
