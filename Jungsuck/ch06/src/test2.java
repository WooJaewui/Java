
public class test2 {
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t1.channel = 7;
		
		System.out.println(t1.channel);
		
		t2 = t1;							// t2(��ü������) = t1(��ü������)
											// t2(������)�� t1�� ��ü�� �����Ѵ�.
		System.out.println(t2.channel);		
		
		t1.channel = 10;					// t1�� ��ü�� ���� �ٲ۴�.
		
		System.out.println(t2.channel);		// t2�� t1��ü�� channel���� ����Ų��.
		
	
	}

}
