
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object object = (a, b) -> a > b ? a : b		// ���ٽ�. �͸�ü
		
		MyFunction f = new MyFunction() {
			public int max(int a, int b) {
				return a > b ? a:b;
			}
		};
		
		MyFunction f2 = (a,b) -> a > b ? a : b;
				
		int value = f.max(3,5);					// error, �Լ��� interface�� �ʿ��ϴ�.
		
		System.out.println(value);
		
			
	}

}

@FunctionalInterface
interface MyFunction{
	public abstract int max(int a, int b);
}



