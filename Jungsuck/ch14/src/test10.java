import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> strStream = Stream.of(new String[]{"a","b","c"});
		
		Stream<String> strStream2 = Arrays.stream(new String[] {"A","B","C"});
		
		strStream.forEach(System.out::println);
		
		strStream2.forEach(System.out::printf);
		
		IntStream intStream = IntStream.of(new Integer(10));
		
		intStream.forEach(System.out::println);
		
	}

}
