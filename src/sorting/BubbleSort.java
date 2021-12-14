package sorting;

import utilities.ArrayUtility;

public class BubbleSort {
	private static int[] inputArray;

	public static int[] sort(int[] arr) {
		inputArray = arr;
		//iterate array from index 0 to next to last index
		for (int i = 0; i < inputArray.length - 1; i++) {
			int elementAtIndex = inputArray[i];
			int nextElement = inputArray[i+1];
			//if element at index is greater than next element, swap
			if (elementAtIndex > nextElement) {

				swap(i, i + 1);
			}
		}

		ArrayUtility.print(inputArray);
		return inputArray;
	}

	public static void swap(int firstIndex, int secondIndex) {
		int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = temp;
	}

}
