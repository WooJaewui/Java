import java.util.Optional;

public class test15 {

	public static void main(String[] args) {
		
//		int[] arr = null;
		int[] arr = new int[0];
		
		System.out.println(arr.length);

		Optional<String> opt = null;
		
		Optional<String> opt2 = Optional.of("");
		
		try {
			opt2.empty();
		} catch (Exception e) {
			System.out.println("오류가발생!");
			e.printStackTrace();
		}
		
		
		System.out.println(opt);
		
		System.out.println(opt2);
		
		
		
	}

}
