import java.util.Scanner;
public class FibonaciMatrixExponentiation {
	private static int MAX_SIZE=1000000007;
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n;
		n=Integer.parseInt(in.nextLine());
		int[][] m = {
			{1,0,0},{1,0,1},{1,1,1}
		};
		int[][] F={
				{2,1,1}	
		};
		int[][] result;
		
		result=matrixPower(m,n-1);
		result= multiplyMatrix(F,result);
		System.out.println(result[0][0]+" "+result[0][2]);
		in.close();
	}
	public static int[][] matrixPower(int[][] A,int x){
		int n=A.length;	
		int[][] result=new int[n][n];
		for(int i=0;i<n;i++){
			result[i][i]=1;
		}
		while(x>0){
			if(x%2==1){
				result=multiplyMatrix(result,A);
			}
			A=multiplyMatrix(A,A);
			x/=2;
		}//end of while
		return result;
	}//end of method
	//method for multiplication of matrix
	public static int[][] multiplyMatrix(int[][] M1,int[][] M2){
		int[][] result;
		int rm1= M1.length;
		int cm1=M1[0].length;
		int rm2=M2.length;
		int cm2=M2[0].length;
		if(cm1!=rm2){
			return null;
		}
		result= new int[rm1][cm2];
		for(int i=0;i<rm1;i++)
		{
			for(int j=0;j<cm2;j++){
				int total=0;
				for(int k=0;k<cm1;k++){
					total=(total+M1[i][k]*M2[k][j])%MAX_SIZE;
				}
				result[i][j]=total;

			}//end of middle loop
		}//end of outer loop
		return result;
	}
}
