package test2;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interChild i = new interChild();
		
		System.out.println(i.mosedd());			
		
	}

}

interface A {
	A method(int a, int b);
	String stop(int a, int b);
}

class interChild implements A {
	public A method(int a, int b) {				// A interface type���� ��ȯ�� �� �ִ� ���� �ڼ� class�� ��ü���̴�.
		A ab = (A)new interChild();
		return ab;
	};
	public String stop(int a, int b) {
		return a+":a"+b;
	};
	A mosedd() {
		A abc = (A)new interChild();
		return abc;
	}
}

//	class e implements A{
//		public A method(int a, int b) {return abc;}
//		public String stop(int a, int b) {return "string";}
//	}

