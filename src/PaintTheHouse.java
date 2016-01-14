import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
class PaintTheHouse {
	static class Worker implements Comparable<Worker>{
		int time;
		int cost;
		int speed;
		
		public Worker(int time,int cost,int speed){
			this.time=time;
			this.cost=cost;
			this.speed=speed;
		}
		@Override
		public int compareTo(Worker obj){
			if(this.time==obj.time){
				if(this.speed==obj.speed)
					return this.cost-obj.cost;
				else
					return obj.speed-this.speed;
			}
			else
				return this.time-obj.time;
		}
	}//end of Worker class
	
	public static void main(String[] args){
		File file = new File("A:\\eclipse\\HackerEarth\\src\\input1.txt");
		try{
			Scanner scanner = new Scanner(file);
			//Scanner scanner = new Scanner(new InputStreamReader(System.in));
			int noOfWorker,currentSpeed;
			long houseArea,areaPainted,totalCost,timeElapsed;
			
			areaPainted=totalCost=timeElapsed=(long) 0;
			currentSpeed=0;
			
			noOfWorker=scanner.nextInt();
			houseArea=scanner.nextLong();
			
			Worker[] w= new Worker[noOfWorker];
			for(int i=0;i<noOfWorker;i++){
				w[i]=new Worker(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
			}
			//we have defined a natural sorting schema to solve our problem
			Arrays.sort(w);
			
			for(int i=0;i<noOfWorker&&areaPainted<=houseArea;i++){
				areaPainted+=(w[i].time-timeElapsed)*currentSpeed;
				if(areaPainted>=houseArea)
					break;
				if(w[i].speed>currentSpeed){
					currentSpeed=w[i].speed;
					totalCost+=w[i].cost;
				}
				timeElapsed=(long) w[i].time;
			
			}
			System.out.println(totalCost);
			scanner.close();
			

		}catch(FileNotFoundException f){
			f.printStackTrace();
		}
		
		
		}//end of main
}
