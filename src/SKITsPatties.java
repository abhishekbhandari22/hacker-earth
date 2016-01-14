	/*
	 * Works completely fine
	 * Created by Abhishek Bhandari 3/1/2016
	 * */
	import java.io.InputStreamReader;
	import java.util.Scanner;
	
	
	class SKITsPatties {
		public static void main(String[] args){
			Scanner sc = new Scanner(new InputStreamReader(System.in));
			int T=sc.nextInt();
			while(T-->0){
				int N=sc.nextInt();
				//because ur code will crash for N=1
				int[] arr=new int[10000000];
				arr[5]=1;arr[8]=1;
				arr[11]=1;arr[14]=1;
				arr[17]=1;arr[19]=1;
				for(int i=20;i<N;i++){
					if((arr[i-6]==1)||(arr[i-9]==1)||(arr[i-20]==1)){
						arr[i]=1;
					}
				}
				if(arr[N-1]==1)
					System.out.println("True");
				else
					System.out.println("False");
					
				
			}//end of while
			sc.close();
		}
	}
