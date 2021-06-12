import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intStream = Stream.iterate(20, n->n+10);
		
		intStream.limit(5).forEach(System.out::println);
		
		Stream<Integer> getStream = Stream.generate(()->5);		//
		
		getStream.limit(10).forEach(System.out::println);
		
		
		
	}

}
