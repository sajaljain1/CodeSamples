package Arrays;

public class MaximumProductSubArray {
	public static void main(String[] args) {
		int[] arr = {2,-2,2};
		int maxSoFar = 1;
		int maxEndingHere = 1;
		int minEndingHere = 1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				maxEndingHere = maxEndingHere * arr[i];
				minEndingHere = mini(minEndingHere*arr[i],1);
			}
			else if(arr[i] == 0){
				maxEndingHere = 1;
				minEndingHere = 1;
			}
			else{
				int temp = maxEndingHere;
				maxEndingHere = maxi(minEndingHere*arr[i],1);
				minEndingHere = temp*arr[i];
			}
			
			if(maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
		}
		System.out.println(maxSoFar);
	}
	
	public static int mini(int x, int y){
		return x>y ? y : x;
	}
	public static int maxi(int x, int y){
		return x>y ? x : y;
	}

}
