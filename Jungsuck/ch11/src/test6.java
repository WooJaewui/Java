import java.util.Arrays;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"cat", "dog", "Lion", "tiger"};
		
		Arrays.sort(str);
		
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(Arrays.toString(str));
		
		
		
		
	}

}
