package ch04;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=2; i++) {
			System.out.println("Hello world!!");
		}
		
		for (int i=10; i>8; i--) {					// for�� �ȿ��� ����� i�� 
			System.out.println("Hello"+i);			// for�� �ۿ��� ����� �� ����.
		}
		
//		for (int i=10; i>=8; i--) {					//	i=0�϶� false�� �ٷ� ������.
//			System.out.println("Hello"+i);		
//		}
		
		for (int i=1; i<=3; i=i*2) {
			System.out.println("world"+i);
		}
			
		for (int i=1, j=10; i <=10; i++, j--) {		// ���� Ÿ���� ���� 2���� ����� �� �ִ�. 
			System.out.println("i="+i+"j="+j);
		}
		
		int sum = 0;
		
		for (int i=1; i<=5; i++) {
			sum += i ;
			System.out.printf("%d%n",sum);
			
		}
	}

}
