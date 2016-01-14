
public class PowerOfTwo {
	public static void main(String[] arg){
		for(int i=1;i<1025;i++)
			System.out.println(i+": "+isPowerOfTwo(i));
	}
	private static boolean isPowerOfTwo(int n){
		
		if((n&1)!=0)
			return false;
		return (n&(n-1))==0;
			}
}
