
class BitManipulation {
	public static void getSubstring(String str){
		int n =str.length();
		for(int i=1;i<(1<<n);i++){
			for(int j=0;j<n;j++)
				if((i&1<<j)!=0)
					System.out.print(str.charAt(j));
			System.out.println("");
		}
	}
	public static void main(String[] str){
		getSubstring("abc");
	}
}
