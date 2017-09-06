package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length-1);
	}
	
	@Override
	public String searchName() {
		return "Binary recursive search";
	}
	
	private int search(int[] arr, int target, int min, int max) {
		int mid = (min + max) / 2;
		if (min > max) {
			return -1;
		}
		if (arr[mid] == target) {
			return arr[mid];
		}
		if (arr[mid] - target > 0) {
			return search(arr, target, min, mid-1);
		}
		return search(arr, target, mid+1, max);
	}
	
}