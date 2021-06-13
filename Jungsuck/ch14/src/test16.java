import java.util.stream.Stream;

public class test16 {

	public static void main(String[] args) {

		Stream<Integer> intS = Stream.of(new Integer[] {1,2});
		
//		System.out.println(intS.reduce(5, (a,b) -> a+b+3));			// 14
		
		System.out.println(intS.reduce(0, (a,b)-> a+b+1));			// 5
		
		
	}

}
