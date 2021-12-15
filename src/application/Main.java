package application;

import sorting.BubbleSort;
import sorting.SelectionSort;
import utilities.ArrayUtility;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 8 };
		// 3,2,8,4
		// 2,4,3,8
		BubbleSort.sortAscendingOrder(arr);
		BubbleSort.sortDescendingOrder(arr);
		int[] arr2 = { 3, 234, 2333, 33, 17, 9, 0, -1, 4, 2, 8 };
		SelectionSort.sortAscendingOrder(arr2);

	}
}
