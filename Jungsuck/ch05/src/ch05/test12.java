package ch05;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				
				{"Chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
				
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			
			System.out.printf("Q%d. %s�� ����?", i+1,words[i][0]);
			
			String init = scanner.nextLine();
			
			if(init.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
		
		
	}

}
