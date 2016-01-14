/*
 * Works completely fine 
 * Created by Abhishek Bhandari 21/12/2015
 * 
 * */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


class UpUp {
	public static void main(String[] args) throws IOException{
		/*BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\input1.txt"));
			*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] arr=br.readLine().split(" ");
			for(int i=0;i<arr.length;i++){
				int len = arr[i].length();
				if(len>1){
					//System.out.println(arr[i]);
					System.out.print(arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1, len)+" ");
					continue;
				}
				if(len == 0){
					System.out.print(" ");
					continue;
				}
				System.out.print(arr[i].substring(0, 1).toUpperCase()+" ");
				
			}
			br.close();/*
		}catch(FileNotFoundException e){
			System.err.println("File not found");
		}catch(IOException e){
			System.err.println("Can't access file");
		}*/
		
	}//end of main
}
