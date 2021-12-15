package utilities;

public class ArrayUtility {

	public static void print(int[] arr) {
		System.out.print("{");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("}");

	}

	public static int[] swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
		return arr;
	}
}
