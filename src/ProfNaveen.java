import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
class ProfNaveen {
	public static void main(String[] args){
		//Scanner scanner = new Scanner(new InputStreamReader(System.in));
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner scanner = new Scanner(file);
			int n=scanner.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i]=scanner.nextInt();
			long count=0L;
			for(int i=0;i<n-2;i++){
				for(int j=i;j<n-1;j++){
					for(int k=j;k<n;k++){
						if((arr[i]>arr[j])&&(arr[j]>arr[k])){
							count++;
						}
					}
				}
			}
			System.out.println(count);
			scanner.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		
	}
}
