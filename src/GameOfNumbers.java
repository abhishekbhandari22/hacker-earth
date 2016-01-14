import java.io.InputStreamReader;
import java.util.Scanner;


class GameOfNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T =sc.nextInt();
		while(T-->0){
			long x,y;
			x=sc.nextLong();
			y=sc.nextLong();
			int count=0;
			if(x==1L){
				count++;
				x++;
			}
			for(long i=x;i<=y;i++){
				boolean isSpecial=true;
				long temp=i;
				for(long j=2;j<=i;j++){
					boolean repeat=false;
					while(temp%j==0){
						if(repeat){
							isSpecial=false;
							break;
						}else{
							repeat=true;
							temp/=j;
						}
					}
					if(!isSpecial)
						break;
				}
				if(isSpecial)
					count++;
			}
			System.out.println(count);
		}//end of while
		sc.close();
	}
}
