package ch04;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
//			System.out.println(Math.random());				// 0.0 <= x < 1.0	0~0.999..
//			System.out.println(Math.random()*10);			// 0.0 <= x < 10.0	0~9.999..
			System.out.println((int)(Math.random()*10)+1);	//   1 <= x < 11    1~10
		}
	}

}
