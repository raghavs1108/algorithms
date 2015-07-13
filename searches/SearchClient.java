public class SearchClient{
	public static void main(String[] args) {
		
		int pos;

		int []a1 = {4, 7, 1, 3, 9, 8, 12, 0, 45, 18, 22, 2};
		LinearSearch s1 = new LinearSearch();
		pos = s1.search(a1, 0);
		System.out.println("POSITION: " + pos);

		// UNFINISHED
		// int []a2 = {1,2,3,4,5,6,7,8,9,10};
		BinarySearch s2 = new BinarySearch();
		pos = s2.search(a2, 7);
		System.out.println("POSITION: " + pos);
	}
}