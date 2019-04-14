package Á·Ï°;

public class dp {
	public int max_string(int arr[]){
		int len = arr.length;
		int Max=0;
		int this_max=0;
		for(int i=0; i<len; i++){
			Max = Math.max(Max, this_max=this_max+arr[i]>0?this_max+arr[i]:0);
		}
		return Max;
	}
}
