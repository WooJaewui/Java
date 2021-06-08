import java.util.*;


public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet(new TestComp());		// 범위 검색, 정렬. 정렬 필요없음.
		Set set2 = new HashSet();		// 정렬 필요.
		
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(10);
		set.add(14);
		set.add(1);
		set.add(new Object());
		
		System.out.println(set);		// [1,3,5,7,10,14];
		
		
		
		
	}

}

class TestComp implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



