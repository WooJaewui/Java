
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
	}
	
	static void �׽�Ʈ1() {
		
//		test7.main();						// main method�� String[] args error�� �߻��Ѵ�.
		System.out.println(10);;			
	}
	
	static void �ѱ�() {
		
		test7.�׽�Ʈ1();						// �ٸ� static method���� static method ��밡���ϴ�.
	}
}
