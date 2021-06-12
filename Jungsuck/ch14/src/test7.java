import java.util.function.Function;

public class test7 {

	public static void main(String[] args) {
		
		Function<String, Integer> f =  (s) -> Integer.parseInt(s);
		
		System.out.println(f.apply("100")+200);
		
		Function<String, Integer> f2 = Integer::parseInt;		// static method reference.
		
		System.out.println(f2.apply("500")+100);				
		
	}

}
