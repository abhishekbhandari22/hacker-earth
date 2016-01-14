import java.io.*;
import java.util.Arrays;
//import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
class SumitandRohil {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> bag =new LinkedList<String>();
		for(int i=0;i<N;i++)
			bag.add(br.readLine());
		int count=0;
		while(!bag.isEmpty()){
			count++;
			String top=bag.remove(0);
			int toplen=top.length();
			for(int i=0;i<bag.size();i++){
				String temp=bag.get(i);
				int templen=temp.length();
				if(templen==toplen){
					if((top.charAt(0)==temp.charAt(0))&&(top.charAt(toplen-1)==temp.charAt(toplen-1))){
						if(isAnagram(top,temp))
							{bag.remove(i);break;
							}
					}
				}
				
			}
		}//end of while
		System.out.println(count);
	}//end of main
	private static boolean isAnagram(String top,String temp){
		char toparr[]=top.toCharArray();
		Arrays.sort(toparr);
		String str1=toparr.toString();
		char temparr[]=temp.toCharArray();
		Arrays.sort(temparr);
		String str2=temparr.toString();
		return str1.equals(str2);
		
	}
}
