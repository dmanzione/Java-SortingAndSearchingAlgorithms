package sorting;

import utilities.ArrayUtility;

public class BubbleSort {
	private static int[] inputArray;

	public static int[] sort(int[] arr) {
		inputArray = arr;

		for (int i = 0; i < inputArray.length; i++) {
			boolean sorted = true;

			for (int j = 0; j < inputArray.length - 1; j++) {
				int elementAtIndex = inputArray[j];
				int nextElement = inputArray[j + 1];

				// if element at index is greater than next element, swap
				if (elementAtIndex > nextElement) {

					swap(j, j + 1);
					sorted = false;
				}

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
