import java.io.*;

class OZ {
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-->0){
			String str = br.readLine();
			int len = str.length();
			int toggle=0;
			for(int i=0;i<len-1;i++){
				if(str.charAt(i)!=str.charAt(i+1))
					toggle++;
			}
			if(!(toggle>1)){
				sb.append(0+"\n");
				continue;
			}
				
			int arr[] = new int[len];
			int zToLeft=0;
			int oToLeft=0;
			for(int i=0;i<len;i++){
				if(str.charAt(i)=='O')
				{	arr[i]=zToLeft; oToLeft++;
				}
				else{
					arr[i]=oToLeft;zToLeft++;}
			}
			int total1=0,total2=0;
			for(int i=0;i<len;i++){
				if(str.charAt(i)=='O')
					total1+=arr[i];
				else
					total2+=arr[i];
			}
			sb.append( (total1>total2 ? total2 : total1)+"\n");
		}//end of while
		System.out.println(sb);
	}
}
