import java.util.stream.Stream;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream intStream = Stream.iterate(1, n->n+10);
		
		intStream.limit(5).forEach(System.out::println);
		
		Stream genStream = Stream.generate(()->10);
		
		genStream.limit(5).forEach(System.out::println);
	}

}
