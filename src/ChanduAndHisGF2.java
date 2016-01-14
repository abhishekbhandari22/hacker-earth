import java.io.InputStreamReader;
import java.util.Scanner;


class ChanduAndHisGF2 {
	static int[] arr,temp;
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T =sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			arr=new int[N];
			temp=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			mergeSortDec(0,N-1);
			for(int i:arr)
				System.out.print(i+" ");
			System.out.println();
		}//end of while
		sc.close();
	}//end of main
	
	static void mergeSortDec(int lower,int upper){
		if(lower<upper){
			int middle=lower+ (upper-lower)/2;
			mergeSortDec(lower,middle);
			mergeSortDec(middle+1,upper);
			mergerMethod(lower,middle,upper);
		}
	}//end of method
	
	static void mergerMethod(int lower,int middle,int upper){
		for(int i=lower;i<=upper;i++)
			temp[i]=arr[i];
		
		int k=lower,j=middle+1;
		while(lower<=middle&&j<=upper){
			if(temp[lower]<temp[j]){
				arr[k]=temp[j];
				j++;
			}else{
				arr[k]=temp[lower];
				lower++;
			}
			k++;
		}//end of while
		while(lower<=middle){
			arr[k]=temp[lower];
			k++;
			lower++;
		}
		
		while(j<=upper){
			arr[k]=temp[j];
			j++;
			k++;
		}
	}
}
