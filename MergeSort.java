	public class MergeSort {
		public void sort(int []a){
			int n = a.length;
			if(n > 1){
				int mid = n/2;
				// System.out.println(mid);
				int []b = copy(a, 0, mid-1);
				int []c = copy(a, mid, n-1);
				// print(b);
				// print(c);
				sort(b);
				sort(c);
				merge(b, c, a);
			}
		}

		private int [] copy(int [] a, int i, int j){
			int  k = 0;
			int [] b = new int[j-i+1];

			while(i <= j) {
				b[k] = a[i];
				i++;
				k++;
			}
			return b;
		}

		private static void print(int []a){
			for(int i = 0; i < a.length; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}

		private void merge(int[]b, int []c, int []a){
			int i=0, j=0, k=0, p=b.length, q=c.length, n=p+q-1;
			while(i<p && j<q){
				if(b[i] < c[j])
					a[k++] = b[i++];
				else
					a[k++] = c[j++];
			}
			if(i == p){
				while(j<q){
					a[k++] = c[j++];
				}
			}
			else{
				while(i<p){
					a[k++] = b[i++];
				}

			}
		}
	}