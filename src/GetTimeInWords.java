import java.io.InputStreamReader;
import java.util.Scanner;


class GetTimeInWords {
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		String[] Hour = new String[13];
		Hour[0]="one";
		Hour[1]="two";
		Hour[2]="three";
		Hour[3]="four";
		Hour[4]="five";
		Hour[5]="six";
		Hour[6]="seven";
		Hour[7]="eight";
		Hour[8]="nine";
		Hour[9]="ten";
		Hour[10]="eleven";
		Hour[11]="twelve";
		Hour[12]="one";
		String[] Minute= new String[31];
		Minute[0]="o' clock";
		Minute[1]="one minute";
		Minute[2]="two minutes";
		Minute[3]="three minutes";
		Minute[4]="four minutes";
		Minute[5]="five minutes";
		Minute[6]="six minutes";
		Minute[7]="seven minutes";
		Minute[8]="eight minutes";
		Minute[9]="nine minutes";
		Minute[10]="ten minutes";
		Minute[11]="eleven minutes";
		Minute[12]="twelve minutes";
		Minute[13]="thirteen minutes";
		Minute[14]="fourteen minutes";
		Minute[15]="quarter";
		Minute[16]="sixteen minutes";
		Minute[17]="seventeen minutes";
		Minute[18]="eighteen minutes";
		Minute[19]="nineteenn minutes";
		Minute[20]="twenty minutes";
		Minute[21]="twenty one minutes";
		Minute[22]="twenty two minutes";
		Minute[23]="twenty three minutes";
		Minute[24]="twenty four minutes";
		Minute[25]="twenty five minutes";
		Minute[26]="twenty six minutes";
		Minute[27]="twenty seven minutes";
		Minute[28]="twenty eight minutes";
		Minute[29]="twenty nine minutes";
		Minute[30]="half";
		
		int H =sc.nextInt();
		int M=sc.nextInt();
		if(M<10)
			System.out.print(H+":0"+M+"-> ");
		else
			System.out.print(H+":"+M+"-> ");
		
		if(M==0){
			System.out.println(Hour[H-1]+" "+Minute[0]);
		}else{
			if(M<=30){
				System.out.println(Minute[M]+" past "+Hour[H-1]);
			}else{
				System.out.println(Minute[60-M]+" to "+Hour[H]);{
					
				}
			}
		}
		
		sc.close();
	}
}
