import java.util.*;


public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet<>();
		
		for (int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			
			set.add(num);
	
		}
		
//		set.sort();							// set은 순서가 없어서 정렬이 안된다.
		
		List list = new LinkedList(set);	// set을 List로 바꿔준다.
		
		Collections.sort(list);				// Collection 인터페이스를 통해 list를 정렬.
		
		System.out.println(list);
		
		
	}

}
