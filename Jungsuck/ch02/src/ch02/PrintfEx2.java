package ch02;

public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.printf("%b%n", 15);                          // boolean
//		System.out.printf("%d%n", 15);                          // 10진수
//		System.out.printf("%o%n", 15);                          // 8진수
//		System.out.printf("%x%n", 15);							// 16진수
//		System.out.printf("%s", Integer.toBinaryString(15));  	// 2진수
		
		float f = 123.456789f;
		System.out.printf("%f%n", f);		// 123.456787	7자리까지 정확함.
		System.out.printf("%e%n", f);		// 1.234568e+02	마지막자리수 반올림.
		System.out.printf("%g%n", f);		// 123.457		마지막자리수 반올림.

	}

}
