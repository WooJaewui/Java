package test2;

public class test18 {
	void method(){
		AZ a = new AZ();
		AZ.SS abcd = a.new SS();
//		AZ.iner az = a.new iner();					// static class는 따로 초기화하지 않는다. 이미 만들어져있음.
		
		
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
//			q = 20;								local 변수중에 상수가 아닌 변수는 메소드 속 클래스에서 사용할 수 없다.
//			final int r = 10;					
//			class AE{ int w = q; };				
//		}
//		
//	}





