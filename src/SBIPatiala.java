/*
 * Works completely fine 
 * Created by Abhishek Bhandari 13/12/2015
 * 
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


class SBIPatiala {
	public static void main(String[] arg){
		long tStart=System.currentTimeMillis();
		/*int test=0;
		int Test;
		BufferedReader br= null;
		BufferedReader br1= null;*/
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			//br = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\input1.txt"));
			//br1 = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\output1.txt"));
			Scanner sc = new Scanner(file);
			//Scanner scanner = new Scanner(new InputStreamReader(System.in));*/
			
		//Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T = sc.nextInt();
		while(T-->0){
			int N= sc.nextInt();
			String[] arr= new String[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.next();
			boolean ans=false;
			for(int i=0;i<N-1;i++){
				String str = arr[i];
				boolean jump2 = false;
				for(int j=i+1;j<N;j++){
					if(arr[j].startsWith(str)||str.startsWith(arr[j])){
						jump2=true;
						break;
					}
				}//end of inner loop
				if(jump2){
					ans=true;
					break;
				}
			}//end of outer loop
			if(ans)
				System.out.println("NO");
			else
				System.out.println("YES");
		}//end of while
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		long tDelta= endTime-tStart;
		System.out.println(tDelta/1000.0);
	}//end of main
}
