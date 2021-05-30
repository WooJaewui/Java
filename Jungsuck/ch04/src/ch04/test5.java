package ch04;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=2; i++) {
			System.out.println("Hello world!!");
		}
		
		for (int i=10; i>8; i--) {					// for문 안에서 선언된 i는 
			System.out.println("Hello"+i);			// for문 밖에서 사용할 수 없다.
		}
		
//		for (int i=10; i>=8; i--) {					//	i=0일때 false라서 바로 끝난다.
//			System.out.println("Hello"+i);		
//		}
		
		for (int i=1; i<=3; i=i*2) {
			System.out.println("world"+i);
		}
			
		for (int i=1, j=10; i <=10; i++, j--) {		// 같은 타입의 변수 2개를 사용할 수 있다. 
			System.out.println("i="+i+"j="+j);
		}
		
		int sum = 0;
		
		for (int i=1; i<=5; i++) {
			sum += i ;
			System.out.printf("%d%n",sum);
			
		}
	}

}
