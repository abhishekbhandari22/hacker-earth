
public class KadaneAlgo {
	public static void main(String[] args){
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		int start=0,end=0,tempStart=-1;
		int max_so_far=0,max_ending_here=0;
		for(int i=0;i<a.length;i++){
			max_ending_here=max_ending_here+a[i];
			if(max_ending_here<0){
				max_ending_here=0;
				tempStart=i+1;}
			if(max_ending_here>max_so_far){
				max_so_far=max_ending_here;
				start=tempStart;
				end=i;
				}
		}//end of for
		System.out.println("Max sum is: "+max_so_far+" starting index: "+start+" ending index: "+end);
	}
}
