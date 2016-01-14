import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


class GeneratingSequence {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc = new Scanner(file);
			//Scanner sc = new Scanner (new InputStreamReader(System.in));
			int T = sc.nextInt();
			while(T-->0){
				long g = sc.nextLong();
				int N = sc.nextInt();
				long x=2*g;
				long y= x+g;
				for(int i =0;i<N-1;i++)
					System.out.print(x+" ");
				System.out.println(y);
				
			}//end of while
			
			sc.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000.0);
	}
}
