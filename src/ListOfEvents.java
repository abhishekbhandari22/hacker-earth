import java.io.InputStreamReader;
import java.util.Scanner;


public class ListOfEvents {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int n= sc.nextInt();
		while(n-->0){
			char[] str=sc.next().toCharArray();
			String rts="";
			for(int i=0;i<str.length;i++){
				if((str[i]>=48)&&(str[i]<=57)){
					String rts2="";
					for(int j=0;j<str[i]-48;j++)
						rts2+=rts;
					rts=rts2;
				}
				else
					rts+=String.valueOf(str[i]);
			}
			System.out.println(rts);
		}//end of while
		
		sc.close();
	}
}
