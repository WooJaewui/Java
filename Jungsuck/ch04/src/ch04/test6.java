package ch04;

public class test6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {				// {}안에 과정을 5번 반복함.
			for(int j=1; j<=10; j++) {
				System.out.print("*");			// 10x*개를 찍음
			}
			System.out.println();				// 줄바꿈.
		}
	
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {			// 조건식에 변수를 넣을 수 있다.
				System.out.print("*");			
			}
			System.out.println();				// 줄바꿈.
		}
	}

}
