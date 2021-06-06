
public class test9 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			
			Exception e = new Exception(new RuntimeException());
			throw e;
		} catch (Exception p) {
			System.out.println(p);
		}
	}
	void method() {
		
	}
}
