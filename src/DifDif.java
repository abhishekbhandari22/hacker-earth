/*
 * Works completely fine 
 * Created by Abhishek Bhandari 21/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


class DifDif {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String str= sc.nextLine();
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<str.length();i++){
			for(int k=i;k<str.length();k++){
				String s="";
				s=str.substring(i, k+1);
				//System.out.println(s);
				set.add(s);
			}
		}
		System.out.println(set.size());
		sc.close();
		
	}
}
