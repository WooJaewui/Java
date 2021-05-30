package ch04;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		case 1: case 2:
		System.out.println("¾È³ç");
		break;
		default :
		System.out.println("error");
		}
	}

}
