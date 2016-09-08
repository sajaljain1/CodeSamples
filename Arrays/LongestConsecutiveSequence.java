package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);
		}
		int ini = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(!hs.contains(arr[i] - 1)){
				int j = arr[i];
				while(hs.contains(j)){
					j++;
				}
				if(count < j-arr[i]){
					count = j-arr[i];
					ini = arr[i];
				}
			}
		}
		for(int i=0;i<count;i++)
		System.out.println(ini++);
	}
}
