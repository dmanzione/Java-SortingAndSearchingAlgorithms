package sorting;

import utilities.ArrayUtility;

public class BubbleSort {
	private static int[] inputArray;

	public static int[] sortAscendingOrder(int[] arr) {
		inputArray = arr;
		int iterations = 0;

		for (int i = 0; i < inputArray.length; i++) {

			boolean thereWasSwap = false;
			for (int j = 0; j < inputArray.length - 1; j++) {
				iterations++;
				int elementAtIndex = inputArray[j];
				int nextElement = inputArray[j + 1];

				// if element at index is greater than next element, swap
				if (elementAtIndex > nextElement) {

					swap(j, j + 1);
					thereWasSwap = true;
				}

			}

			if (!thereWasSwap) {
				break;
			}
		}

		ArrayUtility.print(inputArray);
		System.out.println("Iterations: " + iterations);
		return inputArray;

	}

	public static int[] sortDescendingOrder(int[] arr) {
		inputArray = arr;
		int iterations = 0;
		for (int i = 0; i < inputArray.length; i++) {
			boolean thereWasSwap = false;
			for (int j = 0; j < inputArray.length - 1; j++) {
				iterations++;
				int elementAtIndex = inputArray[j];
				int nextElement = inputArray[j + 1];

				// if element at index is greater than next element, swap
				if (elementAtIndex < nextElement) {
					// swap
					swap(j, j + 1);
					thereWasSwap = true;

				}
				if (!thereWasSwap) {
					break;
				}

			}
		}

		ArrayUtility.print(inputArray);
		System.out.println("Iterations: " + iterations);
		return inputArray;

	}

	public static void swap(int firstIndex, int secondIndex) {
		int temp = inputArray[firstIndex];
		inputArray[firstIndex] = inputArray[secondIndex];
		inputArray[secondIndex] = temp;
	}

}
