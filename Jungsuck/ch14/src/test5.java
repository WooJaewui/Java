import java.util.function.Function;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = a -> a*40;
		
		Function<Integer, Integer> f2 = a -> a/20;
		
		Function<Integer, Integer> h = f.andThen(f2);
		
		System.out.println(h.apply(40));
		
	}

}
