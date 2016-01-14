
import java.util.Scanner;
class MirrorOfGandhi {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while(T-->0){
			String str= in.nextLine();
			int len = str.length();
			
			int c=0;
			char ch;
			for(int i=0;i<len;i++){
				ch=str.charAt(i);
				if(ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'
						||ch=='9'){
					c++;
					break;
				}
			}
			if(c==0){
				int j=0;
				len--;
				while(j<len){
					if(str.charAt(j)!=str.charAt(len)){
						c++;
						break;
					}
					j++;
					len--;
				}
				if(c==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}else
				System.out.println("NO");
			
		}//end of while
		in.close();
	}//end of main
}
