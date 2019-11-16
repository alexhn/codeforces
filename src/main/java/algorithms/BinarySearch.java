package algorithms;

public class BinarySearch {

	public int searchLeftmost(int[] sortedArray, int value) {
		int low = 0;
		int high = sortedArray.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (sortedArray[mid] < value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (sortedArray[low] == value) {
			return low;
		} else {
			return -1;
		}
	}
	
	public int searchRightmost(int[] sortedArray, int value) {
		int low = 0;
		int high = sortedArray.length;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (sortedArray[mid] <= value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (low > 0 && sortedArray[low - 1] == value) {
			return low - 1;
		} else {
			return -1;
		}
	}
	
}
