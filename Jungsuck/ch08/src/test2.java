
public class test2 {

	public static void main(String[] args) {

		System.out.println(10);
		try {
			System.out.println(10);
			System.out.println(20);
		} catch (ArithmeticException b) {
			System.out.println("Exception error�Դϴ�.");
		} catch (Exception a) {
			System.out.println("ArithmeticException error�Դϴ�.");
		}
	}

}
