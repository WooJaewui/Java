package test2;

public class test18 {
	void method(){
		AZ a = new AZ();
		AZ.SS abcd = a.new SS();
//		AZ.iner az = a.new iner();					// static class�� ���� �ʱ�ȭ���� �ʴ´�. �̹� �����������.
		
		
		System.out.println(AZ.iner.a);
	}

}


class AZ {
	static class iner{static int a = 10; int b = 1;};
	class SS{};
	
}

//	class AP {
//		
//		AP p = new AP();
//		
//		int e = aw.z;
//		
//		static class aw{ static int z;};
//		void method(int q) {
//			q = 20;								local �����߿� ����� �ƴ� ������ �޼ҵ� �� Ŭ�������� ����� �� ����.
//			final int r = 10;					
//			class AE{ int w = q; };				
//		}
//		
//	}





