
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();				// ��ü�� ����.
		
		System.out.println(mm.add(2,5));		// 2+5 = 7
												// ��ü�� �żҵ带 �����.
		
		System.out.println(mm.minus(10,5)); 	// 10-5 = 5
		
		System.out.println(mm.max(10, 5));		// 10
												// a > b ? a:b;
		
		System.out.println(mm.min(10, 5));		// 5
												// a < b ? a:b;
		
		mm.printGugudan(3);						// ������ 3�� ���.
		mm.printGugudan(12);					// ������ 12�� ��½���.
		
	}

}
