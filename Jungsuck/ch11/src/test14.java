import java.util.*;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hmap = new HashMap<>();
		
		hmap.put(1, "1234");
		hmap.put(2, "345");
		hmap.put(3, "354");
		hmap.put(4, "34");
		hmap.put(5, "12334");
		
		System.out.println(hmap);
		
		hmap.put(5, "1234");			// 기존에 key값이 있는곳에 새로운 값을 넣으면 덮어쓰기가 된다.
		
		System.out.println(hmap);
		
		Set set = hmap.entrySet();
		
		System.out.println();
		
		System.out.println(hmap.get(2));
		
		
		
		
	}

}
