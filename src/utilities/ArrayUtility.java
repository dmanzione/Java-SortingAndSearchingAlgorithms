package utilities;

public class ArrayUtility {

	public static void print(int[] arr) {
		System.out.print("{");
		for(int i =0;i<arr.length-1;i++) {
			System.out.print(i + ", ");
		}
		System.out.println(arr[arr.length-1]+"}");
	}
}
