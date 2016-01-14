

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

     
     
    class ChanduAndHisGFReturns {
        public static void main(String args[] )throws IOException {
          
             
     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) 
            {
            	String[] s=br.readLine().split(" ");
            	int n=Integer.parseInt(s[0]);
            	int m=Integer.parseInt(s[1]);
             
                ArrayList<Integer> a=new ArrayList<Integer>();
               
            	String[] s1=br.readLine().split(" ");
            	for(int j=0;j<n;j++)
            	{
            		a.add(Integer.parseInt(s1[j]));
            		
            	}
            	String[] s2=br.readLine().split(" ");
            	for(int k=0;k<m;k++)
            	{
            		a.add(Integer.parseInt(s2[k]));
            		
            	}
            	Collections.sort(a);
            	for(int x=a.size()-1;x>=0;x--)
            	{
            	 System.out.print(a.get(x));
            	}
               
               System.out.println();
      
            }
            
     
          
        }
}

