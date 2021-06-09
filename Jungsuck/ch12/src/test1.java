import java.util.*;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList<>();
		
		list.add(10);
		list.add("40");								// 지네릭스에 의해 오류 발생.
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		String i = (String)list.get(1);			// 컴파일러의 한계. (실행시 에러가 발생한다)
		
		
	}

}
