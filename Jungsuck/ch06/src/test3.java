

public class test3 {

	public static void main(String[] args) {
		
		card c = new card();
		card c2 = new card();
		
		c.number = 10;
		
		System.out.println(card.width);			// cv ���.
		System.out.println(c.number);			// iv ���.
		System.out.println(card.height);		// cv�� iv�� �����ϱ����� card.hieght�� ���.
		
		card.width = 10;						// cv ���� ����.
		
		System.out.println(card.width);			// ������ cv ���.
		
		System.out.println(c2.width);			// ������ cv���� �ٲ��� c2�� cv�� �ٲ�.
		
		
	}

}