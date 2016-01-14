
import java.io.*;
public class PKAndInterestinLanguageDP {
	public static void main(String[] arg){
		try{
			int MAX_SIZE= 1000000007;
			BufferedReader br = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\input1.txt"));
			int[][] banned = new int[26][26];
			//get the banned matrix
			String[] str;
			for(int i=0;i<26;i++){
				str = br.readLine().split(" ");
				for(int j=0;j<26;j++)
					banned[i][j]=Integer.parseInt(str[j]);
			}//end of for
			
			int T = Integer.parseInt(br.readLine());
			while(T-->0){
				str=br.readLine().split(" ");
				int ch =((int)str[0].charAt(0))-97;
				int l = Integer.parseInt(str[1]);
				System.out.println(ch+" "+l);
				int[][] dp=new int[l][26];
				for(int i=0;i<26;i++)
					dp[0][i]=1;
				for(int n=1;n<l-1;n++){
					for(int lastLetter=0;lastLetter<26;lastLetter++){
						for(int nextLetter=0;nextLetter<26;nextLetter++){
							if(banned[lastLetter][nextLetter]!=0)
								dp[n+1][nextLetter]=(dp[n+1][nextLetter]+dp[n][lastLetter])%MAX_SIZE;
						}
					}
				}//end of for
				System.out.println(dp[l-1][ch]);
			}//end of while loop
			br.close();
		}catch(FileNotFoundException e){
			System.err.println("File not found!");
		}catch(IOException e){
			System.err.println("Can't access file");
		}
				
	}//end of main
}
