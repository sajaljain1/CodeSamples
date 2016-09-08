package Arrays;

public class MaxSlidingWindow {
	public static void main(String[] args) {
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int w =3;
		int[] b = new int[arr.length-w+1];
		maxSlidingWindow(arr, arr.length, w, b);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}

	public static void maxSlidingWindow(int[] arr, int n, int w, int[] b) {
		DoubleEndedQueueImpl queue = new DoubleEndedQueueImpl();
		for (int i = 0; i < w; i++) {
			while (!queue.isEmpty() && arr[i] >= arr[queue.peakRear()]) {
				queue.removeRear();
			}
			queue.insertRear(i);
		}
		for (int i = w; i < n; i++) {
			b[n-w] = arr[queue.peakFront()];
			while(!queue.isEmpty() && arr[i] >= arr[queue.peakRear()]){
				queue.removeRear();
			}
			while(!queue.isEmpty() && queue.peakFront() <=  i-w){
				queue.removeFront();
			queue.insertRear(i);
			}
			b[n-w] = arr[queue.peakFront()];
		}
	}
}
