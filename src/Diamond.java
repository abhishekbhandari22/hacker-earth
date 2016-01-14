import java.io.*;

class Diamond {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int T= Integer.parseInt(br.readLine());
		while(T-->0){
			String[] str = br.readLine().split(" ");
			int N= Integer.parseInt(str[0]);
			int count=0;
			int M = Integer.parseInt(str[1]);
			char[][] shape= new char[N][M];
			
			for(int i=0;i<N;i++){
				str=br.readLine().split(" ");
				for(int j=0;j<M;j++){
					shape[i][j]=str[j].toCharArray()[0];
				}
			}//end of outer for loop
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					//System.out.print(shape[i][j]);
					if(shape[i][j]=='/'&&(i!=N-1)&&(j!=M-1)){
						if((shape[i][j+1]=='\\')&&(shape[i+1][j]=='\\')&&(shape[i+1][j+1]=='/'))
							count++;
					}
				}//end of inner loop
				System.out.println("");
			}//end of outer loop
			
			System.out.println(count);
		}//end of while
		
		br.close();
	}
}
