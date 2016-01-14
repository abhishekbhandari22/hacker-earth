/*
 * Works completely fine
 * Created by Abhishek Bhandari 4/1/2016
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class CarParking {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0){
			char[] str=br.readLine().toCharArray();
			int N=str.length;
			int[] arr=new int[N];
			for(int i=0;i<N;i++){
				if(str[i]=='-')
					continue;
				arr[i]=1;
				if(str[i]=='B'){
					if(i-1>=0)
						arr[i-1]=1;
					if(i-2>=0)
						arr[i-2]=1;
				}else{
					if(str[i]=='S'){
						if(i-1>=0)
							arr[i-1]=1;
						if(i+1<N)
							arr[i+1]=1;
					}
				}
			}
			int count=0;
			for(int k=0;k<N;k++){
				if(arr[k]==0)
					count++;
			}
			System.out.println(count);
		}//end of while
		
	}
}
