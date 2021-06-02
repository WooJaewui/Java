
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
	}
	
	static void 테스트1() {
		
//		test7.main();						// main method에 String[] args error가 발생한다.
		System.out.println(10);;			
	}
	
	static void 한글() {
		
		test7.테스트1();						// 다른 static method에서 static method 사용가능하다.
	}
}
