
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
		System.out.println(20);
		try {
				
			RuntimeException e = new RuntimeException();	// exception �ν��Ͻ� �����. 
			throw e;										// error �߻���Ű��.
		
		} catch (Exception e) {								
			System.out.println("Exception error�߻�.");		
			e.printStackTrace();							// 
			System.out.println(e.getMessage());
		}
		
		throw new RuntimeException();
		
	}
		
}
