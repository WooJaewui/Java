import java.util.ArrayList;
import java.util.Collections;

public class test1 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList(10);	// capacity(�뷮)�� 10�� ArrayList�� ����.
		
		
		list1.add(5);							// ����ڽ̿� ���� int 5 => Integer 5�� �ȴ�.
		list1.add(new Integer(5));
		list1.add(new String("5"));
		list1.add(new Long(123));
		list1.add(new Double(1.23));
		list1.add(new Double(1.23));
		list1.add(new Double(1.23));
//		Collections.sort(al)					// Collecions ��ƿŬ����. Colletion�� �ٷ�� Ŭ����.
		
		ArrayList al = new ArrayList(list1.subList(2,5));
		
		System.out.println(list1.subList(1,4));		// ���ο� �迭�� ���������. (�б�����)
		
		System.out.println(al);
		
		al.add(2,"�ѱ�");
													
		System.out.println(al);
		
		System.out.println(list1);
		
		System.out.println(list1.containsAll(al));
		
		System.out.println(al.indexOf("�ѱ�"));
		
		al.remove(2);
		
		System.out.println(al);
		
		System.out.println(al.contains(list1.get(2)));
		
		
		
	}

}
