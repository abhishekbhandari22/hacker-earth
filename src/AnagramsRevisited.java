import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


class AnagramsRevisited {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		String[] strings=new String[N];
		for(int i=0;i<N;i++){
			char[] arr= sc.next().toCharArray();
			Arrays.sort(arr);
			strings[i]=String.valueOf(arr);
			}
		Arrays.sort(strings);
		int maxCount=1;
		String top=strings[0];
		int count=1;
		for(int i=1;i<N;i++){
			String bottom=strings[i];
			//if top and bottom are equal then increase the count
			if(top.equals(bottom)){
				count++;
				//if count is greater than max count do needful
				if(count>maxCount)
					maxCount=count;
			}else{
				//change top with bottom and set count to 1
				top=bottom;
				count=1;
			}
		}//end of for
		System.out.println(maxCount);
		
		sc.close();
	}
}
