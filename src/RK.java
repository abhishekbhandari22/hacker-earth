import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class RK {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(T>0){
			char a[]= br.readLine().toCharArray();
			int n=a.length;
			int b[] = new int[n];
			
			for(int i=0;i<n;i++){
				if(a[i]=='K')
					b[i]=1;
				else
					b[i]=-1;
				//System.out.print(b[i]);
			}
			
			int end=0,start=0,tempStart=0;
			int max_ending_here=0,max_so_far=0;
			//get the start and end index for the subsequence having largest sum 
			for(int i=0;i<n;i++){
				max_ending_here+=b[i];
				if(max_ending_here<0)
				{
					max_ending_here=0;
					tempStart=i+1;
				}
				if(max_ending_here>max_so_far){
					max_so_far=max_ending_here;
					start=tempStart;
					end=i;
				}
			}
			//now change all the K to R and vice versa and adjust b array
			for(int i=start;i<=end;i++){
				if(a[i]=='K'){
					a[i]='R';b[i]=-1;
					}
				else{
					a[i]='K';b[i]=1;
					}
				} 
			//now again calculate the largest sum of contiguous elements
			//initialize
			max_ending_here=0;max_so_far=0;
			for(int i=0;i<n;i++){
				max_ending_here-=b[i];
				if(max_ending_here<0)
					max_ending_here=0;
				if(max_ending_here>max_so_far)
					max_so_far=max_ending_here;
			}
			sb.append(max_so_far+"\n");
			T--;
		}
		System.out.println(sb);
		
	}//end of main
}
