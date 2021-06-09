
import static java.util.Collections.*;
import java.util.*;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		
		addAll(list, 1,2,3,4,5,6,7 );
		
		System.out.println(list);
		
		rotate(list, 3);
		
		System.out.println(list);
		
		shuffle(list);
		
		System.out.println(list);
		
		sort(list);
		
		System.out.println(list);
		int idx = binarySearch(list, 3);
		System.out.println(idx);
		
		sort(list, reverseOrder());
		
		System.out.println(list);

		System.out.println(max(list));
		System.out.println(min(list));
		
		System.out.println(disjoint(list, list));
		
		List list2 = new ArrayList<>();
		
		addAll(list2, 2,2,2,2,2);
		
		System.out.println(list);
		
	}
	
	

}
