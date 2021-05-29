package ch3;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 1234;
		
		System.out.println(f);
		
		int a = 1_000_000;
		int b = 2_000_000;			
		
		long c = a*b;				// a*b에서 이미 overflow가 발생해서 -가 되었다.
									// 대입연산자가 마지막.
		long d = (long)a*b;
		
		System.out.println(c);		// -1454759936  overflow에 의해 -가 나왔다.
		System.out.println(d);		// 2000000000000으로 정확한 값이 나왔다.
		
	}

}