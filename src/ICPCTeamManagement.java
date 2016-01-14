/*
 * Not a working solution
 * */

import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class ICPCTeamManagement {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T>0){
			String st[] = br.readLine().split(" ");
			int N = Integer.parseInt(st[0]);
			int k = Integer.parseInt(st[1]);
			boolean possible=true;
			String name[] = new String[N];
			int nameLen[]= new int[N];
			//get all the names and update length of all the name is nameLen array
			for(int i=0;i<N;i++){
				name[i]=br.readLine();
				nameLen[i]=name[i].length();
			}
			Arrays.sort(nameLen);
			for(int i=0;i<N;i+=k){
				if(!isPossible(nameLen,i,k)){
					possible=false;
					break; //get out of for loop to test for other cases in while
				}
			}
			if(possible)
				sb.append("Possible\n");
			else
				sb.append("Not possible\n");
			T--;
		}//end of while
		System.out.println(sb);
	}//end main
	public static boolean isPossible(int[] arr,int i,int k){
		for(int j=i;j<k-1;j++){
			if(arr[j]!=arr[j+1])
				return false;
		}
		return true;
	}
}
