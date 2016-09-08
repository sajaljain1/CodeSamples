package Arrays;

public class MinimumValueRotatedArray {
	public static void main(String[] args) {
		int[] arr = {7,8,9,10,11,12,13,14,15,1,2,3,4,5,6};
		System.out.println(minValue(arr,0,arr.length-1));
	}
	
	public static int minValue(int[] arr,int low, int high){
		if(high<low)
			return arr[0];
		if(high == low)
			return arr[low];
		int mid = low + (high-low)/2 ;
		
		if(mid < high && arr[mid] < arr[mid-1])
			return arr[mid];
		if(arr[high] > arr [mid]){
			return minValue(arr, low, mid-1);
		}
		return minValue(arr, mid+1, high);
		
	}
}

