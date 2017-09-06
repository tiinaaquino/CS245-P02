package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length-1;
		int mid;
		
		while (min <= max) {
			mid = (min + max) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] - target > 0) {
				max = mid - 1;
			}
			else {
				min = mid + 1;
			}
		}
		return -1;
	}
	
	@Override
	public String searchName() {
		return ("binary iterative search");
	}
	
}