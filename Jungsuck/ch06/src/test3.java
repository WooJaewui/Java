

public class test3 {

	public static void main(String[] args) {
		
		card c = new card();
		card c2 = new card();
		
		c.number = 10;
		
		System.out.println(card.width);			// cv 출력.
		System.out.println(c.number);			// iv 출력.
		System.out.println(card.height);		// cv는 iv와 구분하기위해 card.hieght로 사용.
		
		card.width = 10;						// cv 새로 대입.
		
		System.out.println(card.width);			// 대입한 cv 출력.
		
		System.out.println(c2.width);			// 공유한 cv값이 바껴서 c2의 cv도 바뀜.
		
		
	}

}