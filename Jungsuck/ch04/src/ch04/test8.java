package ch04;
import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i=12345; i>0; i= i/10) {
			System.out.println(i%10);
			sum += i%10;
		}
		System.out.println(sum);
	}

}
