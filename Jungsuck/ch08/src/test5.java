

public class test5 {

	public static void main(String[] args) {
		
//		method();								//error
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception");
		} 
	

		
	}
	static void method() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception();
	}
}
