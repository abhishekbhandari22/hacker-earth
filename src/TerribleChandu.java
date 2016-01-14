import java.util.Scanner;
class TerribleChandu {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		StringBuilder sb = new StringBuilder();
		while(T-->0){
			String str = in.nextLine();
			StringBuffer stb = new StringBuffer(str);
			stb.reverse();
			sb.append(stb+"\n");
		}
		System.out.println(sb);
		in.close();
	}

}
