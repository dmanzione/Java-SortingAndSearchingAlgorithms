package sorting;

import utilities.ArrayUtility;

public class BubbleSort {

	public static int[] sort(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] > inputArray[i + 1]) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[i + 1];
				inputArray[i + 1] = temp;

			}
		}
		
		ArrayUtility.print(inputArray);
		return inputArray;
	}

}
