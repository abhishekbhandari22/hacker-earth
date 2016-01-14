import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AshimaCat {
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String cat[] = br.readLine().split(" ");
		String food[] = br.readLine().split(" ");
		int c[] = stringtoint(cat);
		int f[]= stringtoint(food);
		
		sort(c);
		sort(f);
		int total=0;
		
		for(int i=0;i<N;i++)
			total+=c[i]*f[i];
		
		System.out.println(total);
	}
	
	public static int[] stringtoint(String[] str){
		int[] arr = new int[str.length];
		for(int i=0; i<str.length;i++){
			arr[i]=Integer.parseInt(str[i]);
		}
		return arr;
	}
	
	private static void sort(int[] arr){
		int len= arr.length;
		int temp;
		for(int i=0;i<len;i++){
			for(int j=len-1;j>i;j--){
				if(arr[j]>arr[j-1]){
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
}
