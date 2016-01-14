import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


class RickAndZombie {
	public static void main(String[] args){
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner scanner = new Scanner(file);
			//Scanner scanner = new Scanner(new InputStreamReader(System.in));
			int T = scanner.nextInt();
			while(T-->0){
				int N = scanner.nextInt();
				Vector<Integer> d = new Vector<Integer>();
				for(int i=0;i<N;i++)
					d.add(scanner.nextInt());
				Collections.sort(d);
				int i=1;
				int closest;
				int count=0;
				while(!d.isEmpty()){
					closest=d.remove(0);
					if(closest==0){
						break;
					}
					if(i==6){
						update(d);
						i=1;
						continue;
					}
					//d.remove(0);
					update(d);
					count++;
					i++;
				}//end of inner while
				if(d.isEmpty())
					System.out.println("Rick now go and save Carl and Judas");
				else
					System.out.println("Goodbye Rick"+"\n"+count);
				
			}//end of while
			scanner.close();
			}catch(FileNotFoundException f){
				f.printStackTrace();
			}
	}
	private static void update(Vector<Integer> v){
		for(int i=0;i<v.size();i++)
			v.set(i, v.elementAt(i)-1);
	}
}
