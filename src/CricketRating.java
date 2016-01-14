import java.io.InputStreamReader;
import java.util.Scanner;


class CricketRating {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		int sum,maxSum,rating;
		sum=maxSum=0;
		for(int i=0;i<N;i++){
			rating= sc.nextInt();
			//total+=rating;
			sum+=rating;
			if(sum<0){
				sum=0;
				continue;
			}
			if(sum>maxSum)
				maxSum=sum;
		}
		
			System.out.println(maxSum);
		sc.close();
	}
}
