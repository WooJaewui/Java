package ch05;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				
				{"Chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
				
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			
			System.out.printf("Q%d. %s의 뜻은?", i+1,words[i][0]);
			
			String init = scanner.nextLine();
			
			if(init.equals(words[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
		
		
	}

}
