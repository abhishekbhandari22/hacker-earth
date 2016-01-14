/*
 * Works completely fine 
 * Created by Abhishek Bhandari 14/12/2015
 * 
 * */
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class ProfBagchi2 {
	static class Student implements Comparable<Student>{
		int id;
		int bIndex;
		boolean wasVisited;
		public Student(int id){
			this.id=id;
			bIndex=Integer.MAX_VALUE;
			wasVisited=false;
		}
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			if(o.bIndex==this.bIndex)
				return this.id-o.id;
			else
				return o.bIndex-this.bIndex;
		}
	}//end of Student class
	
	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int N = sc.nextInt();
		int H= sc.nextInt();
		int L = sc.nextInt();
		
		Student[] students = new Student[N];
		boolean[][] mat= new boolean[N][N];
		int[] bad = new int[H];
		for(int i=0;i<N;i++)
			students[i]= new Student(i);
		for(int i=0;i<H;i++){
			int id=sc.nextInt();
			bad[i]=id;
			students[id].bIndex=0;
			students[id].wasVisited=true;
		}
		for(int i=0;i<L;i++){
			int f1=sc.nextInt();
			int f2 = sc.nextInt();
			mat[f1][f2]=mat[f2][f1]=true;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<H;i++)
			q.add(bad[i]);
		
		while(!q.isEmpty()){
			int top=q.remove();
			students[top].wasVisited=true;
			for(int i=0;i<N;i++){
				if(i==top)
					continue;
				if(mat[top][i]==true){
					if(students[i].wasVisited==false){
						students[i].bIndex=students[top].bIndex+1;
						q.add(i);
					}else
						students[i].bIndex=students[i].bIndex<students[top].bIndex+1?students[i].bIndex:students[top].bIndex+1;
				students[i].wasVisited=true;
				}
			}//end of for
		}//end of while
		Arrays.sort(students);
		System.out.println(students[0].id);
		sc.close();
	}
}
