import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


class LuckyNumber {
	public static void main(String[] str){
		long startTime = System.currentTimeMillis();
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc= new Scanner(file);
			//Scanner sc = new Scanner(new InputStreamReader(System.in));
			int T= sc.nextInt();
			while(T-->0){
				long N=sc.nextLong();
				long x=2;
				long sum=0;
				long MOD=1000000007L;
				while(x<=N){
					long y=x;
					long t=1L;
					boolean cont=true;
					while(y>t&&cont){
						long temp =(x+t);
						t=t<<1;
						if(N>=temp)
							sum=(sum+temp)%MOD;
						else
							cont=false;
					}
					x*=2;
				}
				System.out.println(sum);
			}//end of while
			
			sc.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		long endTime =System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000.0);
	}
}
