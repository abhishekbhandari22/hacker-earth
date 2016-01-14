import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


class AryaStrikes {
	static class Position{
		public int x,y;
		public Position(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int T=sc.nextInt();
		while(T-->0){
			int N = sc.nextInt();
			int[][] mat= new int[N][N];
			boolean[][] visited=new boolean[N][N];
			visited[0][0]=true;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++)
					mat[i][j]=sc.nextInt();
			}
			Stack<Position> s=new Stack<Position>();
			s.add(new Position(0,0));
			while(!s.empty()){
				Position top =s.pop();
				int x=top.x;
				int y=top.y;
				if((x<N-1)&&(mat[x+1][y]==1)&&!visited[x+1][y]){
					s.add(new Position(x+1,y));
					visited[x+1][y]=true;
				}
				if((y<N-1)&&(mat[x][y+1]==1)&&!visited[x][y+1]){
					s.add(new Position(x,y+1));
					visited[x][y+1]=true;
				}
			}//end of DFS
			
			if(visited[N-1][N-1])
				System.out.println("POSSIBLE");
			else
				System.out.println("NOT POSSIBLE");
		}//end of while
		sc.close();
	}
}
