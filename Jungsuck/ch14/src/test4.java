import java.util.function.*;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Integer> s = () -> (int)(20);
		Consumer<Integer> s2 = a -> System.out.println(a);
		
		s2.accept(10);
		
		System.out.println(s.get());
		
		Predicate<Integer> s3 = a -> a==0;
		
		System.out.println(s3.test(10));
			
		Function<Integer, Integer> s4 = a -> a*10;
		
		System.out.println(s4.apply(20));
		
		Runnable s5 = () -> System.out.println(5);
	
		s5.run();
	}
}
