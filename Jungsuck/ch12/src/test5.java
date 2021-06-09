import java.util.*;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Child> map = new HashMap<>();
		
		map.put("ÀÚ¹Ù¿Õ", new Child(1,80, 70, 60));
		
		Child c = map.get("ÀÚ¹Ù¿Õ");
		
		System.out.println(c.id);
		System.out.println(c.kor);
		System.out.println(c.math);
		System.out.println(c.eng);
		System.out.println(map);
		
		
	}

}

class Child{
	int id;
	int kor;
	int math;
	int eng;
	
	
	Child(){};
	
	Child(int id, int kor, int math, int eng){
		
		this.id = id;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	
		
		
	}
	
	
}


