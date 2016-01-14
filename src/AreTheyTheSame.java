/*
 * Works completely fine 
 * Created by Abhishek Bhandari 13/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
class AreTheyTheSame {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		char[] a1=sc.nextLine().toCharArray();
		char[] a2=sc.nextLine().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(String.valueOf(a1).equals(String.valueOf(a2)))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
