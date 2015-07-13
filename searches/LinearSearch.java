public class LinearSearch{
	public int search(int []a, int k){
		int i = 0;
		while(i < a.length){
			if(k == a[i])
				return i;
			i++;
		}
		return -1;
	}
}