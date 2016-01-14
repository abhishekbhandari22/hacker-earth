import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


class XennyAndPartiallySortedStrings {
	static int M;
	static class Sstring implements Comparable<Sstring>{
		String str;
		String strSub;
		public Sstring(String str){
			this.str=str;
			this.strSub=str.substring(0, M);
		}
		@Override
		public int compareTo(Sstring o) {
			// TODO Auto-generated method stub
			return strSub.compareTo(o.strSub);
			
		}
		
	}//end of class Sstring
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		File file2 = new File("A:\\eclipse\\HackerEarth\\src\\output1.txt");
		
		try{
			Scanner sc = new Scanner(file);
			Scanner sc2 = new Scanner(file2);
			//Scanner sc = new Scanner (new InputStreamReader(System.in));
			int T= sc.nextInt();
			while(T-->0){
				int N = sc.nextInt();
				int k = sc.nextInt();
				M = sc.nextInt();
				Sstring[] strings = new Sstring[N];
				for(int i=0;i<N;i++)
					strings[i]=new Sstring(sc.next());
				Arrays.sort(strings);
				
				System.out.println(strings[k-1].str.equals(sc2.next()));
			}
			sc.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000.0);
		
	}
}
