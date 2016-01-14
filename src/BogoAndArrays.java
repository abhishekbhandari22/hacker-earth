import java.io.InputStreamReader;
import java.util.Scanner;


class BogoAndArrays {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int T =sc.nextInt();
		while(T-->0){
			long N=sc.nextLong();
			int k=sc.nextInt();
			int arr[]=new int[Integer.valueOf(String.valueOf(N))];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			long count=0L;
			long n=1<<N;
			for(long i=1;i<n;i++){
				int index=0;
				long temp=i;
				while(temp>0L){
					//System.out.print("upper "+temp);
					if((i&1L)!=0){
						if(arr[index]>k){
							count++;
							//System.out.print(" "+arr[index]);
							break;
						}
					}
					index++;
					temp=temp>>1;
					//System.out.print("lower "+temp);
				}//end of while
						
				
			}
			System.out.println(count);
		}//end of while
		sc.close();
	}//end of main
}
