import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



class MissingAlphabets {
	static String alphabetOrder="";
	static int T,M;
	static ArrayList<String> words;
	
	public static void main(String[] args) throws IOException{
		//InputStreamReader isr = new InputStreamReader(System.in);
		try{
			BufferedReader br = new BufferedReader(new FileReader("A:\\eclipse\\HackerEarth\\src\\input1.txt"));
			//BufferedReader br = new BufferedReader(isr);
		
			T= Integer.parseInt(br.readLine());
			while(T>0){
				words=new ArrayList<String>();
				alphabetOrder=br.readLine();
				M=Integer.parseInt(br.readLine());
				while(M>0){
					words.add(br.readLine());
					M--;
				}//end of inner while
				sort();
				for(int i=0;i<words.size();i++){
					System.out.println(words.get(i));
				}
			
				T--;
			}//end of outer while
		}catch(FileNotFoundException f){
			f.printStackTrace();
			}
		
	}
	
	private static void sort(){
		
		for(int i=0;i<words.size();i++){
			for(int j=words.size()-1;j>i;j--){
				swap(j);
			}//end of inner loop
		}//end of outer loop
		
		
		
	}//end of method
	
	private static void swap(int index){
		String a=words.get(index-1);
		String b = words.get(index);
		boolean change=false;
		int aLen=a.length(),bLen=b.length();
		if(aLen>bLen){
			if(a.substring(0, bLen).equals(b.substring(0, bLen))){
				change=true;
			}
		}else{
		
			for(int i=0;(i<aLen&&i<bLen);i++){
				/*System.out.println(alphabetOrder.indexOf(a.charAt(i)));
				System.out.println(alphabetOrder.indexOf(b.charAt(i)));*/
				
				if(alphabetOrder.indexOf(a.charAt(i))>alphabetOrder.indexOf(b.charAt(i))){
				change=true;
				break;
				}
			}//end of for loop
		}
		if(change){
			words.set(index, a);
			System.out.println(alphabetOrder);
			System.out.println(a+" : "+b);
			words.set(index-1, b);
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){
				
			}
			
			
		}
	}//end of method
}//end of class
