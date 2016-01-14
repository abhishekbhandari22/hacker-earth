/*
 * Works completely fine 
 * Created by Abhishek Bhandari 14/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class BigPAndParty {
	static class person{
		int id;
		int lucky;
		boolean wasVisited;
		public person(int id){
			this.id=id;
			this.lucky=Integer.MAX_VALUE;
			this.wasVisited=false;		
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		int A= sc.nextInt();
		int B=sc.nextInt();
		person[] arr= new person[A];
		for(int i=0;i<A;i++)
			arr[i]=new person(i);
		
		boolean[][] mat= new boolean[A][A];
		/*for(int i=0;i<A;i++){
			for(int j=0;j<A;j++){
				mat[i][j]=false;
			}
		}*/
		for(int i=0;i<B;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			mat[a][b]=mat[b][a]=true;
		}
		arr[0].lucky=0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		while(!q.isEmpty()){
			int top=q.peek();
			arr[top].wasVisited=true;
			for(int i=0;i<A;i++){
				if(i==top)
					continue;
				if(mat[top][i]==true){
					if(arr[i].wasVisited==false){
						arr[i].lucky=arr[top].lucky+1;
						q.add(i);
					}else
						arr[i].lucky=arr[i].lucky<arr[top].lucky+1?arr[i].lucky:arr[top].lucky+1;
				arr[i].wasVisited=true;
				}
			}//end of for
			q.remove();
		}//end of while
		
		for(int i=1;i<A;i++){
			System.out.println(arr[i].lucky);
		}
		sc.close();
	}
	
}
