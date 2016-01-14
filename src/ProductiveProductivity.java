import java.io.*;
class ProductiveProductivity {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			int total=0;
			int arr[][]= new int[N][N];
			for(int i=0;i<N;i++){
				String st[] = br.readLine().split(" ");
				for(int k=0;k<N;k++)
					arr[i][k]=Integer.parseInt(st[k]);
			}//get all the values in arr 
			boolean skip[][]= new boolean[N][N];
			
			
			
			System.out.println(total);
		}//end of while
	}//end of main
}
