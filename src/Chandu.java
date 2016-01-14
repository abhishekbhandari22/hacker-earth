import java.util.Scanner;
class Chandu {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int T= in.nextInt();
		
		StringBuilder sb= new StringBuilder();
		while(T>0){
			String str= in.next();
			sb.append(str.charAt(0));
			for(int i=1; i<str.length();i++){
				if(!(str.charAt(i)==str.charAt(i-1)))
						sb.append(str.charAt(i));
			}
			sb.append("\n");
			
			T--;
		}//end of while
		System.out.println(sb);
		in.close();
	}
}
