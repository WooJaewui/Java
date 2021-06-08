import java.util.*;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		HashSet set3 = new HashSet();
		HashSet set4 = new HashSet();
		HashSet set5 = new HashSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		System.out.println(set1);
		System.out.println(set2);
		

		// 교집합. set1 n set2
		
		Iterator iter = set1.iterator();
		
		while(iter.hasNext()) {
			Object tmd = iter.next();
			if(set2.contains(tmd))
				set3.add(tmd);
			
		}
		
	
		
		
		System.out.println(set3);	
		
		// 차집합. set1-set2
		
		iter = set1.iterator();
		
		while(iter.hasNext()) {
			
			Object tmd = iter.next();
			if(!(set2.contains(tmd)))
				set4.add(tmd);
			
		}
			
		System.out.println(set4);

		// 합집합.
		
		iter = set1.iterator();
		
		while(iter.hasNext()) {
			set5.add(iter.next());
		}
		
		iter = set2.iterator();
		
		while(iter.hasNext()) {
			set5.add(iter.next());
		}
		
		System.out.println(set5);
		
		List list = new LinkedList(set5);
		
		Collections.sort(list);
		
		System.out.println(set5);
		
//		set1.addAll(set2);			// 합집합.
//		set1.retainAll(set2);		// 교집합.
		set1.removeAll(set2);		// 차집합.
		
		System.out.println(set2);
	
		
	}

}
