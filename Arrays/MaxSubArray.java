package Arrays;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] arr = {3,4,1,2,-4,10};
		int maxEnding = 0;
		int maxHere = 0;
		for(int i=0;i<arr.length;i++){
			maxEnding = maxEnding + arr[i];
			if(maxEnding < 0){
				maxEnding = 0;
			}
			if(maxHere < maxEnding){
				maxHere = maxEnding;
			}
		}
		if(maxHere == 0){
			maxHere = arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i] > maxHere){
					maxHere = arr[i];
				}
			}
		}
		System.out.println(maxHere);
	}
}
