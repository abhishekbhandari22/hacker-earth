import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class SortingTheString {
	static int order=0;
	static class alphabet implements Comparable<alphabet>{
		char ch;
		public alphabet(char ch){
			this.ch=ch;
		}
		@Override
		public int compareTo(alphabet o) {
			if(this.ch==o.ch)
				return 0;
			if(order==0)
				return this.ch-o.ch;
			else
				return o.ch-this.ch;
		}
			
		
	}//end of alphabet
	
	public static void main(String[] args){
		List<alphabet> words;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		//File fileIn = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		//File fileOut = new File("A:\\eclipse\\HackerEarth\\src\\output1.txt");
		int count=0;
		/*try{
			Scanner scannerIn = new Scanner(fileIn);
			Scanner scannerOut= new Scanner(fileOut);*/
			int T= scanner.nextInt();
			//int Tt=T;
			while(T-->0){
				boolean cont=false;
				char[] array = scanner.next().toCharArray();
				order=scanner.nextInt()%2;
				words= new LinkedList<alphabet>();
				for(int i =0;i<array.length;i++){
					if(array[i]>='A'&&array[i]<='Z'){
						cont=true;
						words.add(new alphabet(array[i]));
					}
						
				}
				if(cont){
					Collections.sort(words);
					String str="";
					for(int i=0;i<words.size();i++){
						str=str+(words.get(i).ch);
					}
					//if(str.equals(scannerOut.next()))
							//count++;
					System.out.println(str);
				}else{
					System.out.println("NULL");
					//count++;
					//scannerOut.next();
				}
				
				
			}//end of while
			//System.out.println(Tt+" "+count+" "+(Tt-count));
			scanner.close();
			//scannerOut.close();
		/*}catch(FileNotFoundException f){
			f.printStackTrace();
		}*/
		}
}
