
public class test6 {

	public static void main(String[] args) {
		int g = 10;
//		System.out.println(method10(10));			try-catch�� ���� �ʾƼ� Exception error�߻�.
		System.out.println(method10(10));			
		
	}
	
	static int method10(int s) {
		try {
		if (true) { 
			return s;
		}
			return 10+s;
		} catch (Exception e){
			return 10+s;
		}
	}
}
