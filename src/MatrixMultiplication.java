
public class MatrixMultiplication {
	private int[][] M1;
	private int[][] M2;
	private boolean M1Ready=false;
	private boolean M2Ready=false;
	
	public MatrixMultiplication(int[][] m1,int[][] m2){
		M1=m1;
		M2=m2;
	}
	
	public void setMatrixOne(int n,int k){
		//use it when u r using this class as an object
		M1Ready=true;
		
	}
	
	public int[][] multiplyMatrix(){
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
					total+=M1[i][k]*M2[k][j];
				}
				result[i][j]=total;

			}//end of middle loop
		}//end of outer loop
		return result;
	}
}
