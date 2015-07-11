public class SelectionSort {
	public void sort(int [] a) {
		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			swap(a, i, min);
		}
	}

	private void swap(int []a , int i , int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}