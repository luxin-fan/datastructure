package package_section_2;

public class SelectionSort {
	public static void selectionSort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			// 找到[i,n)中最小的元素
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int t = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = t;
	}

	public static void main(String[] args) {
		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		selectionSort(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}