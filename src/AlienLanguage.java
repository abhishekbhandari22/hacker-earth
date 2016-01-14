import java.util.Scanner;
class AlienLanguage {
	public static void main(String[] srg){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while(T-->0){
			String jhool = in.nextLine();
			String jaadu= in.nextLine();
			if(jhool.contains(jaadu))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}//end of main
}
