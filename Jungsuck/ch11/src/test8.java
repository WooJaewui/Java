import java.util.*;


public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet<>();
		
		for (int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			
			set.add(num);
	
		}
		
//		set.sort();							// set�� ������ ��� ������ �ȵȴ�.
		
		List list = new LinkedList(set);	// set�� List�� �ٲ��ش�.
		
		Collections.sort(list);				// Collection �������̽��� ���� list�� ����.
		
		System.out.println(list);
		
		
	}

}
