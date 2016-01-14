/*
 * Works completely fine
 * Created By Abhishek Bhandari 23/12/2015
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


class ICPCTeamManagement2 {
	public static void main(String[] args){
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc = new Scanner(file);

			//Scanner sc = new Scanner(new InputStreamReader(System.in));
			int T = sc.nextInt();
			
			while(T-->0){
				int N = sc.nextInt();
				int K = sc.nextInt();
				boolean possible = true;
				int[] len = new int[1001];
				for(int i =0;i<N;i++){
					int length = sc.next().length();
					len[length]+=1;
				}
				for(int i=0;i<1001;i++){
					if((len[i]%K)!=0){
						possible = false;
						break;
					}
				}
				if(possible)
					System.out.println("Possible");
				else
					System.out.println("Not possible");
			}
			
			sc.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		
	}
}
