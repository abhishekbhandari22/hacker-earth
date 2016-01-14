
/*import java.io.File;
import java.io.FileNotFoundException;*/
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class KingdomOfMonkeys {
	/*static int[][] mat;
	static boolean[] visited;
	static long[] bananas;
	static int N ;*/
	static long[] bananas;
	public static void main(String[] args){
		/*File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner sc = new Scanner(file);*/
			Scanner sc = new Scanner(new InputStreamReader(System.in));
			int T = sc.nextInt();
			while(T-->0){
				long maxBanana=0L;
				long Banana=0L;
				int N = sc.nextInt();
				graph g = new graph(N);
				bananas= new long[N];
				int M = sc.nextInt();
				for(int i=0;i<M;i++){
					int m1=sc.nextInt()-1;
					int m2=sc.nextInt()-1;
					//add edge
					g.addEdge(m1,m2);
				}
				for(int i=0;i<N;i++)
					bananas[i]=sc.nextLong();
				//now we have loaded all the data into our variables so lets run 
				//loop until all the vertices have been visited
				for(int i=0;i<N;i++){
					//if the vertex was visited before skip it 
					if(g.visited[i]==false){
						//other wise run the method to get the count of banana in a forest/team
						Banana=g.bfs(i);
						//if the team's total is greater than our maxBanana counter then do needful
						if(Banana>maxBanana)
							maxBanana=Banana;
					}
				}//end of for
				System.out.println(maxBanana);
			}//end of while
			sc.close();
			//Scanner sc = new Scanner(new InputStreamReader(System.in));
		/*}catch(FileNotFoundException f){
			f.printStackTrace();
		}*/
		
	}//end of main
	static class graph{
		boolean[] visited;
		
		static int N;
		LinkedList<Integer>[] adj;
		public graph(int items){
			N=items;
			adj=new LinkedList[N];
			for(int i=0;i<N;i++)
				adj[i]=new LinkedList<Integer>();
			visited= new boolean[N];
			
		}
		// Function to add an edge into the graph
		void addEdge(int v,int w) {
			adj[v].add(w);
			adj[w].add(v);
		}
		
		long bfs(int i){
			long banana=bananas[i];
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(i);
			visited[i]=true;
			while(!q.isEmpty()){
				int top= q.remove();
				Iterator<Integer> itr=adj[top].iterator();
				while(itr.hasNext()){
					int j=itr.next();
					if(visited[j]==false){
						banana+=bananas[j];
						visited[j]=true;
						q.add(j);
					}//end of if
				}//end of inner while
				
			}//end of outer while
			return banana;
		}
	}
	
}
