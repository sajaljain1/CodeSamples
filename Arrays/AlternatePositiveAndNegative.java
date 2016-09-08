package Arrays;

public class AlternatePositiveAndNegative {
	public static int[] arr = { 1, 2, 3, -4, -1, 4 };

	public static void main(String[] args) {
		rearrange(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void rearrange(int[] arr) {
		int outOfPlace = -1;
		for (int i = 0; i < arr.length; i++) {
			if (outOfPlace >= 0) {
				//System.out.println("outOfPlace" + outOfPlace);

				if ((arr[i] >= 0 && arr[outOfPlace] < 0)
						|| (arr[i] < 0 && arr[outOfPlace] >= 0)) {
					rotateArray(arr, outOfPlace, i);

					if (i - outOfPlace > 2) {
						outOfPlace += 2;
					} else
						outOfPlace = -1;
				}
			}
			if (outOfPlace == -1) {
				if ((i % 2 == 0 && arr[i] > 0) || (i % 2 == 1 && arr[i] < 0)) {
					outOfPlace = i;
				}
			}

		}
	}

	public static void rotateArray(int[] arr, int outOfPlace, int i) {
		int temp = arr[i];
		for (int j = i; j > outOfPlace; j--) {
			arr[j] = arr[j - 1];
		}
		arr[outOfPlace] = temp;
	}
}
