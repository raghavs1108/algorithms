public class ComparisonSort {
	public int [] sort(int []a){
		int n = a.length;
		int [] count = new int[n];
		int [] s = new int[n];

		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j<n;j++){
				if(a[i] < a[j]){
					count[j]++;
				}
				else{
					count[i]++;
				}
			}
		}
		for(int i = 0; i<n; i++){
			s[count[i]] = a[i];
		}

		return s;
	}
}