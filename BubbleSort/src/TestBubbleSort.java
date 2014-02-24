public class TestBubbleSort {
	public static void main(String[] args) {
		int[] a = { 12, 45, 32, 13, 5, 7, 65, 21 };

		Bubblesort sort = new Bubblesort();

		sort.displayArray();

		int[] result = sort.bubbleSort(a);

		sort.displayArray(result);
	}
}
