import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


class ChanduAndHisGF {
	static class Gift implements Comparable<Gift>{
		int element;
		public Gift(int element){
			this.element=element;
		}

		@Override
		public int compareTo(Gift o) {
			// TODO Auto-generated method stub
			return o.element-this.element;
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T =sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			Gift[] arr = new Gift[N];
			for(int i=0;i<N;i++)
				arr[i]=new Gift(sc.nextInt());
			Arrays.sort(arr);
			for(int i=0;i<N;i++)
				System.out.print(arr[i].element+" ");
			System.out.println();
		}
		sc.close();
	}
}
