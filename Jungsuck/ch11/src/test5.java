import java.util.Arrays;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		int[] arr3 = Arrays.copyOf(arr, arr.length);
		
		int[] arr4 = Arrays.copyOfRange(arr,2,5);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = new int[5];
		
		Arrays.setAll(arr5, i -> (int)(Math.random()*10)+1);
		
		System.out.println(Arrays.toString(arr5));
		
		String[] arr6 = new String[5];
		
		Arrays.fill(arr6, "&");
		
		System.out.println(Arrays.toString(arr6));
		
		char[] charr = {'a','c','d','b'};
		
		System.out.println(Arrays.binarySearch(charr, 'b'));
		
		Arrays.sort(charr);
		
		System.out.println(Arrays.binarySearch(charr, 'c'));
		
	}

}
