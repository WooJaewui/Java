
import java.util.*;
import java.util.stream.Stream;

public class test9 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> intStream = list.stream();
		
		intStream.forEach(System.out::print);
		
//		intStream.forEach(System.out::print);		// stream�� ��ȸ���̴�.	 error�߻�.
		
	}

}
