package ch02;

public class VarEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20;
		int tmp;
		
		tmp = x;	// x�� ���� tmp�� ����.
		x = y;		// y�� ���� x�� ����.
		y = tmp;	// tmp�� �ִ� x�� ���� y�� ����.
		
		System.out.println("x="+x);		// x=20
		System.out.println("y="+y);		// y=10
	}

}
