import java.util.function.Function;
import java.util.function.Supplier;

public class test8 {

	public static void main(String[] args) {

		Supplier<test1> c = test1::new;
		
		Function<Integer,className> c2 = className::new;
		
		System.out.println(c2.apply(100).iv);
		
		Function<Integer, int[]> n = int[]::new;
		
		System.out.println(n.apply(200).length);
		
		
	}

}


class className{
	int iv;
	
	className() {}
	
	className(int iv){
		this.iv = iv;
	}
}


