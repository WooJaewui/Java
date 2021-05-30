package ch04;
import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("(1) 시작.");
			System.out.println("(2) 실패.");
			System.out.println("(0) 종료.");
			System.out.println("원하는 메뉴(1,2,0)중에 선택하세요.");
			
			int menu = scanner.nextInt();
			
			if(menu==0) {
				System.out.println("종료되었습니다.");
				break;
			} else if (menu==1){
				System.out.println("시작됩니다.");
				break;
			} else {
				System.out.println("실패입니다. 다시 시도해주세요.");			
				continue;
			}
		}
		
		
		
	}

}
