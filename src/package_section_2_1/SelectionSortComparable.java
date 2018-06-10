package package_section_2_1;

public class SelectionSortComparable {

	// 该算法不允许创建实例

	public static void SelectionSortComparable(Comparable[] arr, int n) {
		for (int i = 0; i < n; i++) {
			// 找到[i,n)中最小的元素
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}

	private static void swap(Object[] arr, int i, int minIndex) {
		Object t = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = t;
	}

	public static void main(String[] args) {
		// 测试Integer
		Integer[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		SelectionSortComparable.SelectionSortComparable(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.println();

		// 测试Double
		Double[] b = { 4.4, 3.3, 2.2, 1.1 };
		SelectionSortComparable.SelectionSortComparable(b, b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.println();

		// 测试String
		String[] c = { "D", "C", "B", "A" };
		SelectionSortComparable.SelectionSortComparable(c, c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			System.out.print(' ');
		}
		System.out.println();

		// 测试自定义的类 Student
		Student[] d = new Student[4];
		d[0] = new Student("D", 90);
		d[1] = new Student("C", 100);
		d[2] = new Student("B", 95);
		d[3] = new Student("A", 95);
		SelectionSortComparable.SelectionSortComparable(d, d.length);
		for (int i = 0; i < d.length; i++)
			System.out.println(d[i]);
	}
}
