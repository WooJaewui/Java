package ch04;
import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("(1) ����.");
			System.out.println("(2) ����.");
			System.out.println("(0) ����.");
			System.out.println("���ϴ� �޴�(1,2,0)�߿� �����ϼ���.");
			
			int menu = scanner.nextInt();
			
			if(menu==0) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else if (menu==1){
				System.out.println("���۵˴ϴ�.");
				break;
			} else {
				System.out.println("�����Դϴ�. �ٽ� �õ����ּ���.");			
				continue;
			}
		}
		
		
		
	}

}
