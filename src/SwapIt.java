import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class SwapIt {
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int swap = Integer.parseInt(str[1]);
			int arr[] =stringtoint(br.readLine().split(" "));
			selSort(arr,swap);
			display(arr);
			T--;
		}//end of while
	}//end of main
	
	public static int[] stringtoint(String[] str){
		int[] arr = new int[str.length];
		for(int i=0; i<str.length;i++){
			arr[i]=Integer.parseInt(str[i]);
		}
		return arr;
	}
	
	public static void display(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
	private static void selSort(int[] arr,int swap){
		int len = arr.length;
		int temp;
		for(int i=0; i<len;i++){
			if(swap>0){
				for(int j=len-1;j>i;j--){
					if(swap>0){
						if(arr[j]<arr[j-1]){
							temp=arr[j];
							arr[j]=arr[j-1];
							arr[j-1]=temp;
							swap--;	
						}
					}else
						break;
				}//end of inner loop	
			}
			else
				break;
			
		}//end of outer loop
	}//end of method
}//end of class
