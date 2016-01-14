import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


class RK2 {
	public static void main(String[] args){
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc= new Scanner(file);
			//Scanner sc = new Scanner(new InputStreamReader(System.in));
			int T= sc.nextInt();
			while(T-->0){
				char[] arr=sc.next().toCharArray();
				int n=arr.length;
				int[] v=new int[n];
				int count=0;
				for(int i=0;i<n;i++){
					if(arr[i]=='R'){
						v[i]=-1;
						count++;
					}
					else
						v[i]=1;
					//System.out.print(v[i]);
				}
				
				int maxEndingHere=0, maxSoFar=0;
				for(int i=0;i<n;i++){
					maxSoFar+=v[i];
					if(maxSoFar<0)
						maxSoFar=0;
					if(maxSoFar>maxEndingHere)
						maxEndingHere=maxSoFar;
				}
				System.out.println(maxEndingHere+count);
			}
			sc.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		
	}
}
