import java.util.ArrayList;
import java.util.Collections;

public class test1 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList(10);	// capacity(용량)이 10인 ArrayList를 생성.
		
		
		list1.add(5);							// 오토박싱에 의해 int 5 => Integer 5가 된다.
		list1.add(new Integer(5));
		list1.add(new String("5"));
		list1.add(new Long(123));
		list1.add(new Double(1.23));
		list1.add(new Double(1.23));
		list1.add(new Double(1.23));
//		Collections.sort(al)					// Collecions 유틸클래스. Colletion을 다루는 클래스.
		
		ArrayList al = new ArrayList(list1.subList(2,5));
		
		System.out.println(list1.subList(1,4));		// 새로운 배열이 만들어진다. (읽기전용)
		
		System.out.println(al);
		
		al.add(2,"한글");
													
		System.out.println(al);
		
		System.out.println(list1);
		
		System.out.println(list1.containsAll(al));
		
		System.out.println(al.indexOf("한글"));
		
		al.remove(2);
		
		System.out.println(al);
		
		System.out.println(al.contains(list1.get(2)));
		
		
		
	}

}
