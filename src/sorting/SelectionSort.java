package sorting;

import utilities.ArrayUtility;

public class SelectionSort {
	
	public static int[] sortAscendingOrder(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int smallestFromCurrentIndexOn = arr[i];
			int indexOfSmallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (smallestFromCurrentIndexOn > arr[j]) {
					smallestFromCurrentIndexOn = arr[j];
					indexOfSmallest = j;
				}
			}
			if (smallestFromCurrentIndexOn != arr[i]) {
				arr = ArrayUtility.swap(arr, i, indexOfSmallest);
			}
		}

		ArrayUtility.print(arr);
		return arr;
	}

	
}
