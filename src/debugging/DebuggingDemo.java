package debugging;

public class DebuggingDemo {
	public static void main(String[] args) {

		int array[] = new int[] { 5, 0, -35, 45, 150, 3 };

		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();

		int max = max(array);
		System.out.println("Maximum of the array is " + max);
	}

	private static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}
}
