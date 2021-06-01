
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();				// 객체를 만듬.
		
		System.out.println(mm.add(2,5));		// 2+5 = 7
												// 객체의 매소드를 사용함.
		
		System.out.println(mm.minus(10,5)); 	// 10-5 = 5
		
		System.out.println(mm.max(10, 5));		// 10
												// a > b ? a:b;
		
		System.out.println(mm.min(10, 5));		// 5
												// a < b ? a:b;
		
		mm.printGugudan(3);						// 구구단 3단 출력.
		mm.printGugudan(12);					// 구구단 12단 출력실패.
		
	}

}
