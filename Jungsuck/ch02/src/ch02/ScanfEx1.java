package ch02;
import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();	
//		int num2 = scanner.nextInt();	
//		System.out.println(num);				// console에 처음 적은 값 출력.
//		System.out.println(num2);				// console에 두번째 적은 값 출력.
		
		String input = scanner.nextLine();		
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
