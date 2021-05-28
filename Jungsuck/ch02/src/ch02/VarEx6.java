package ch02;

public class VarEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20;
		int tmp;
		
		tmp = x;	// x의 값을 tmp에 저장.
		x = y;		// y의 값을 x에 저장.
		y = tmp;	// tmp에 있는 x의 값을 y에 저장.
		
		System.out.println("x="+x);		// x=20
		System.out.println("y="+y);		// y=10
	}

}
