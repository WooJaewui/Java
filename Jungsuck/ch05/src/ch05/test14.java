package ch05;

import java.util.Arrays;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,4,3,1,5};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D1 = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 =	{{"aaa","bbb"},{"AAA","BBB"}};
		
		
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
//		System.out.println(Arrays.Equals(str2D1, str2D2));		// error 2차원이상은 deep.
		
		int[] b = Arrays.copyOf(arr, 4);						// arr에서 0~4까지 복사.
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 5)));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
