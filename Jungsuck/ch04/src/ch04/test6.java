package ch04;

public class test6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {				// {}�ȿ� ������ 5�� �ݺ���.
			for(int j=1; j<=10; j++) {
				System.out.print("*");			// 10x*���� ����
			}
			System.out.println();				// �ٹٲ�.
		}
	
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {			// ���ǽĿ� ������ ���� �� �ִ�.
				System.out.print("*");			
			}
			System.out.println();				// �ٹٲ�.
		}
	}

}
