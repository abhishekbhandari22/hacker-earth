import java.math.BigInteger;
import java.util.Scanner;
public class RangeSum {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str[] = in.nextLine().split(" ");
		BigInteger a = new BigInteger(str[0]);
		BigInteger b = new BigInteger(str[1]);
		BigInteger n = new BigInteger("1");
		n=n.add(b);
		n=n.add(a.negate());
		//n.shiftRight(1);
		BigInteger Sum = new BigInteger("0");
		Sum=Sum.add(a);
		Sum=Sum.add(b);
		Sum=Sum.multiply(n);
		Sum=Sum.shiftRight(1);
		System.out.println(Sum);
		in.close();
	}
}
