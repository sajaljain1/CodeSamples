package Arrays;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = new int[12];
		arr1[0] = 1;
		arr1[1] = 3;
		arr1[2] = 5;
		arr1[3] = 7;
		arr1[4] = 9;
		arr1[5] = 11;
		int length1 = 5;
		int length2 = 5;
		int length = 11;
		int[] arr2 = {2,4,6,8,10,12};
		while(length>=0){
			if(length2<0 || (length1>=0 && arr1[length1] > arr2[length2])){
				arr1[length--] = arr1[length1--];
			}
			else{
				arr1[length--] = arr2[length2--];
			}
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}
