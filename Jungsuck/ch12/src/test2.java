import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list2 = new ArrayList();
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		list.add(new Tv());
		list2.add(new Tv());
//		list.add(new Audio());				// Error
		
		Tv t =(Tv)list2.get(0);				// 일반클래스 형변환필요.
		
		Tv t2 = list.get(0);				// 지네릭클래스 형변환 불필요.
		
		System.out.println(t);
		System.out.println(t2);
		
		
		
	}

}

class Tv {}
class Audio{}
