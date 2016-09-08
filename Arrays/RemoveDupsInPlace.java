package Arrays;

public class RemoveDupsInPlace {
	public static void main(String[] args) {
		int[] arr = { 5, 5, 6, 7, 7, 9,9,12,14,14,16,16};
		// expected output {5,6,7,9} and 4
		int length = 1;
		int index1 = 0, index2 = 0;
		int temp = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i] != temp){
				arr[++index1] = arr[i];
				temp = arr[i];
			}
		}

		for (int i = 0; i <= index1; i++)
			System.out.print(arr[i]+" ");
	}
}
