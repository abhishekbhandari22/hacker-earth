import java.io.InputStreamReader;
import java.util.Scanner;


class PrefPref {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		char[] sarr = sc.next().toCharArray();
		char[] tarr= sc.next().toCharArray();
		int s=0,t=0;
		while((s<sarr.length)&&(t<tarr.length)){
			if(sarr[s]==tarr[t]){
				s++;
			}
			t++;
		}
		System.out.println(s);
		sc.close();
	}
}
