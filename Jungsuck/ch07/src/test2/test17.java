package test2;


public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB b = new BBB();
//		CCC c = new CCC();
		
//		System.out.println(b.CCC.method());
	};

}

class AAA {
	BBB b = new BBB();
	
}

class BBB {
	int b_b = 10;
	
	
	
	void method2() {
		
		class CCC {
			int iv = 300;
			final static int Const = 300;
			void method() {
				System.out.println(b_b);
			}
		}
		
		int i = CCC.Const;
//		int i2 = CCC.method();
		System.out.println(i);
	}
	
	

}


