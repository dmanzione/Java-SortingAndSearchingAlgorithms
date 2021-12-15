package utilities;

public class ArrayUtility {

	public static void print(int[] arr) {
		System.out.print("{");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("}");
	}
}
