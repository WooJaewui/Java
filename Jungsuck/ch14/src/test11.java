import java.util.Random;
import java.util.stream.IntStream;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = new Random().ints(5,10);
		
		intStream.limit(5).forEach(System.out::println);
		
		
	}

}
