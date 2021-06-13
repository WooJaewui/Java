import java.util.ArrayList;
import java.util.stream.Stream;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(7);
		
		Stream<Integer> strList = list.stream();
		
//		strList.forEach(System.out::print);
		strList.sorted().forEach(System.out::print);
		
		

	}

}
