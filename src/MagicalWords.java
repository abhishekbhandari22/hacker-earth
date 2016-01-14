import java.util.Scanner;
class MagicalWords {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while(T-->0){
			String str = in.nextLine();
			int len = str.length();
			StringBuffer sb;
			int power = 0;
			for(int i=0;i<len;i++){
				for(int j=i+1;j<=len;j++){
					sb= new StringBuffer(str.substring(i,j));
					sb.reverse();int l=sb.length();
					if(sb.toString().equals(str.substring(i,j)))
						power=power+l*l;
				}
			}
			System.out.println(power);
		}//end of while
		in.close();
	}//end of main
}
