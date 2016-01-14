import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
class ProfBagchi {
	static class Student implements Comparator<Student>{
		public int index;
		public int id;
		public List<Integer> friends;
		public Student(int id){
			this.id=id;
			this.index=Integer.MAX_VALUE;
			friends = new LinkedList<Integer>();
		}
		
		/*@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			if(this.index==o.index)
				return 0;
			return -(this.index-o.index);
		}*/
		public void addFriends(int id){
			friends.add(id);
		}

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			if(o1.index==o2.index)
				return 0;
			return o2.index-o1.index;
		}
	}
	public static void main(String[] args){
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner scanner = new Scanner(file);
			//Scanner scanner = new Scanner(new InputStreamReader(System.in));
			int N= scanner.nextInt();
			int H= scanner.nextInt();
			int L = scanner.nextInt();
			Student[] students=new Student[N];
			for(int i=0;i<N;i++)
					students[i]= new Student(i);
			List<Integer> bad = new LinkedList<Integer>();
			for(int i=0;i<H;i++)
				bad.add(scanner.nextInt());
			for(int i=0;i<L;i++){
				int f1=scanner.nextInt();
				int f2=scanner.nextInt();
				students[f1].addFriends(f2);
				students[f2].addFriends(f1);
			}
			for(int i=0;i<N;i++){
				Student student = students[i];
				if(bad.contains(i)){
					student.index=0;
					continue;
				}
				List<Integer> friends = student.friends;
				for(int j=0;j<bad.size();j++){
					if(friends.contains(bad.get(j))){
						student.index=1;
						continue;
						}
				}
			}
			Comparator<Student> comp = new Comparator<Student>(){

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					if(o1.index==o2.index)
						return 0;
					return o2.index-o1.index;
				}
				
			};
			Arrays.sort(students,comp);
			for(Student student : students){
				System.out.println(student.id+" : "+student.index);
			}
			if(students[0].index==students[1].index){
				int j=1;
				//List<Student> good = new LinkedList<Student>();
				//good.add(students[0]);
				while(students[0].index==students[j].index){
					//good.add(students[j]);
					//System.out.println(j, students[j].id,students[j].index);
					j++;
				}
				Comparator<Student> c = new Comparator<Student>(){
					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						return o1.id-o2.id;
					}
					
				};
				Arrays.sort(students, 0, j, c);
				//Collections.sort(students,,, c);
				//System.out.println(good.get(0).id);
			}
				System.out.println(students[0].id);
			
			
			scanner.close();
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		
		
	}
}
