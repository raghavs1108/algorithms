public class BinarySearch {
	public int search(int []a, int k){
		int l = 0;
		int r = a.length -1;
		int mid;
		int iterCount = 0;
		while(l < r){
			mid = (l+r)/2;
			System.out.println("ITERCOUNT: " + iterCount++);
			System.out.println("MID: " + mid);
			if(k == a[mid])
				return mid;
			else if(k < a[mid])
				r = mid-1;
			else
				l = mid +1;
		}
		return -1;
	}
}