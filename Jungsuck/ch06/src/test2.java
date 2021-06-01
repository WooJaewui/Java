
public class test2 {
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t1.channel = 7;
		
		System.out.println(t1.channel);
		
		t2 = t1;							// t2(객체리모콘) = t1(객체리모콘)
											// t2(리모콘)가 t1의 객체를 조종한다.
		System.out.println(t2.channel);		
		
		t1.channel = 10;					// t1의 객체의 값을 바꾼다.
		
		System.out.println(t2.channel);		// t2가 t1객체의 channel값을 가르킨다.
		
	
	}

}
