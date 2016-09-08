package Arrays;

public class RemoveGivenElement {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 6, 7, 7, 9,9,12,14,14,16,16};
		// remove 9;
		int length = 1;
		int index1 = -1; 
		int temp = 9;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != temp){
				arr[++index1] = arr[i];
			}
		}

		for (int i = 0; i <= index1; i++)
			System.out.print(arr[i]+" ");
	}
}
