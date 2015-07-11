public class SortClient {
	public static void main(String[] args) {

		System.out.println("ORIGINAL ARRAY:");
		int []a1 = {4, 7, 1, 3, 9, 8, 12, 0, 45, 18, 22, 2};
		print(a1);
		System.out.println();

		System.out.println("SELECTION SORT:");
		SelectionSort s1 = new SelectionSort();
		s1.sort(a1);
		print(a1);

		int []a2 = {4, 7, 1, 3, 9, 8, 12, 0, 45, 18, 22, 2};
		
		System.out.println("BUBBLE SORT:");
		BubbleSort s2 = new BubbleSort();
		s2.sort(a2);
		print(a2);

		int []a3 = {4, 7, 1, 3, 9, 8, 12, 0, 45, 18, 22, 2};

		System.out.println("MERGE SORT:");
		MergeSort s3 = new MergeSort();
		s3.sort(a3);
		print(a3);

		int []a4 = {4, 7, 1, 3, 9, 8, 12, 0, 45, 18, 22, 2};

		System.out.println("QUICK SORT:");
		QuickSort s4 = new QuickSort();
		s4.sort(a4);
		print(a4);
		
	}

	private static void print(int []a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}