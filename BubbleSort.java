public class BubbleSort {
	public void sort(int []a){
		int n = a.length;
		for(int i = 0; i < n-1; i++){

			for (int j= 0; j < n-1-i; j++){

				if(a[j] > a[j+1]){
					swap(a, j, j+1);
				}
			}
		}
	}

	private void swap(int []a , int i , int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}