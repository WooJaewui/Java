package ch3;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 1234;
		
		System.out.println(f);
		
		int a = 1_000_000;
		int b = 2_000_000;			
		
		long c = a*b;				// a*b���� �̹� overflow�� �߻��ؼ� -�� �Ǿ���.
									// ���Կ����ڰ� ������.
		long d = (long)a*b;
		
		System.out.println(c);		// -1454759936  overflow�� ���� -�� ���Դ�.
		System.out.println(d);		// 2000000000000���� ��Ȯ�� ���� ���Դ�.
		
	}

}