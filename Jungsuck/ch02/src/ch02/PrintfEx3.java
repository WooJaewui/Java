package ch02;

public class PrintfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String url = "www.naver.com";
//		
//		System.out.printf("[%s]%n", url);		[www.naver.com]
//		System.out.printf("[%20s]%n", url);		[	  www.naver.com]
//		System.out.printf("[%-20s]%n", url);	[www.naver.com     ]
//		System.out.printf("[%.5s]%n", url);		[www.n]
		
//		System.out.printf("[%5d]%n", 10);    	// [   10]
//		System.out.printf("[%-5d]%n", 10);   	// [10   ]
//		System.out.printf("[%d]%n", 10);     	// [10]
//		System.out.printf("[%05d]%n", 10);   	// [00010]
//		System.out.printf("[%5d]%n", 1234567);  // [1234567]
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);		// 1.2345678900		소수점 10자리 출력.
		System.out.printf("%14.6f%n", d);		//     1.234568		소수점 6자리 출력.
		
	}

}
