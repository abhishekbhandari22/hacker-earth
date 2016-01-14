import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;


class SimpleDivision {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T=sc.nextInt();
		while(T-->0){
			float a=sc.nextInt();
			float b=sc.nextInt();
			int c=sc.nextInt();
			String df="######";
			if(c!=0){df+=".";
				for(int i=0;i<c;i++)
				df+="0";}
			DecimalFormat DF= new DecimalFormat(df);
			System.out.println(DF.format(a/b));
		}
		
		
		sc.close();
	}
}
