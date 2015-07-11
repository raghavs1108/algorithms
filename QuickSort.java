public class QuickSort {
	
	public void sort(int []a){
		sort(a, 0, a.length-1);
	}

	private void sort(int[]a, int l, int r){
		if(l<r){
			int s = partition(a, l, r);
			sort(a, l, s-1);
			sort(a, s+1, r);

		}
	}

	public int partition(int []a, int l, int r){
		int p = a[l];
		int n = a.length;
		int i = l+1, j = r;
		while(i < j) {
			while(i < r && a[i] < p) // add the bounds checking.
				i++;
			while(j> l && a[j] >= p) // add the bounds checking.
				j--;

			swap(a, i, j);
		}
		swap(a, i, j); // swap again to remove the final extra swap that has taken place. imperative that this be there.
		swap(a, l, j);
		return j;
	}

	private void swap(int []a , int i , int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}