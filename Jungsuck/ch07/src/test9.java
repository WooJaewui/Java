
public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv5 t5 = new Tv5();
		SmartTv5 st5 = new SmartTv5();
		
		System.out.println(st5 instanceof Tv5);				// true
		System.out.println(t5 instanceof SmartTv5);			// flase
		
		
	}

}

class Tv5 {
	
	int a;
	int b;
}

class SmartTv5 extends Tv5{
	
	int c;
}