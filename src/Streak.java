import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
class Streak {
		public static void main(String[] args)throws IOException{
			try{
				BufferedReader br = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\input1.txt"));
				int T = Integer.parseInt(br.readLine());
				while(T-->0){
					String s = br.readLine();
					if((Integer.parseInt(s)%21)==0){
						System.out.println("The streak is broken!");
						continue;
					}else {
						boolean two=false,fail=false;
						for(int i =0;i<s.length();i++){
							if(s.charAt(i)=='2')
								two=true;
							else{if(two&(s.charAt(i)=='1')){
								System.out.println("The streak is broken!");
								fail=true;
								break;
							}}
						}
						if(!fail)
							System.out.println("The streak lives still in our heart!");
					}
				}
				br.close();

			}catch(FileNotFoundException e){
				System.err.println("File not Found");
			}
		}//end of main
}
