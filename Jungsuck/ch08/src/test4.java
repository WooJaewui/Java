
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
		System.out.println(20);
		try {
				
			RuntimeException e = new RuntimeException();	// exception 인스턴스 만들기. 
			throw e;										// error 발생시키기.
		
		} catch (Exception e) {								
			System.out.println("Exception error발생.");		
			e.printStackTrace();							// 
			System.out.println(e.getMessage());
		}
		
		throw new RuntimeException();
		
	}
		
}
