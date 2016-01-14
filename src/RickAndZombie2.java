import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//import java.util.Vector;


class RickAndZombie2 {
	public static void main(String[] args)throws IOException{
		/*long tStart=System.currentTimeMillis();
		int test=0;
		int Test;
		BufferedReader br= null;
		BufferedReader br1= null;
		//File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			br = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\input1.txt"));
			br1 = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\output1.txt"));
			//Scanner scanner = new Scanner(file);
			//Scanner scanner = new Scanner(new InputStreamReader(System.in));*/
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			int T = Integer.parseInt(br.readLine());
			//Test=T;
			while(T-->0){
				int N = Integer.parseInt(br.readLine());
				int[] d = new int[N];
				String[] str = br.readLine().split(" ");
				for(int i=0;i<N;i++)
					d[i]=Integer.parseInt(str[i]);
				Arrays.sort(d);
				int[] t = new int[N];
				for(int i=0;i<N;i++){
					t[i]=i+i/6+1;
				}
				//int i=1;
				//int closest;
				int count=0;
				for(int i=0;i<N;i++){
					if(t[i]>d[i])
						break;
					count++;
				}
				
				if(count==N){
					//if(br1.readLine().equals("Rick now go and save Carl and Judas"));
						//test++;
					//continue;
					System.out.println("Rick now go and save Carl and Judas");
				}else{
					//if(br1.readLine().equals("Goodbye Rick"))
						//if(br1.readLine().equals(String.valueOf(count)))
							//test++;	
					System.out.println("Goodbye Rick"+"\n"+count);		
					
				}
					
					
				
				/*while(!d.isEmpty()){
					closest=d.remove(0);
					if(closest==0){
						break;
					}
					if(i==6){
						update(d);
						i=1;
						continue;
					}
					//d.remove(0);
					update(d);
					count++;
					i++;
				}//end of inner while
				if(d.isEmpty())
					System.out.println("Rick now go and save Carl and Judas");
				else
					System.out.println("Goodbye Rick"+"\n"+count);
				*/
			}//end of while
			//scanner.close();
			br.close();
			/*br1.close();
			if(test==Test)
				System.out.println("Success");
			else
				System.out.println("Fail");
			}catch(FileNotFoundException e){
				System.err.println("File not found");
			}catch(IOException e){
				System.err.println("Can't access file");
			}
		long endTime = System.currentTimeMillis();
		long tDelta= endTime-tStart;
		System.out.println(tDelta/1000.0);*/
	}//end of main
}
