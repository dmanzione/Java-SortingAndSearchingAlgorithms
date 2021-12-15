package application;

import sorting.BubbleSort;

public class Main {

	public static void main(String[] args) {
		int[] arr = {3, 4, 2, 8 };
		//3,2,8,4
		//2,4,3,8
		BubbleSort.sortAscendingOrder(arr);
		BubbleSort.sortDescendingOrder(arr);
		
		
	}
}
