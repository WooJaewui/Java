
public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abs a = new excu();						// �θ� ���������� �ڽ� �ν��Ͻ� ����. (������ + �������̵�)
		
		a.method();								// ��Ӱ��迡 �Ѵ� �ִ� method���� �θ� ���������ε� ��밡���ϴ�.
		a.stop();								
	}				
}

abstract class abs{
	
	abstract void method();
	abstract void stop();
}

class excu extends abs{
	
	void method() {
		System.out.println(10);
	}
	void stop() {
		System.out.println(20);
	}
}

abstract class excu2 extends abs{
	
	void method() {
		System.out.println(10);				// abstract stop method�� �������� �ʾƼ� error�߻��Ѵ�.
	}										// �޼ҵ带 �ϼ��ϴ���, class�� abstract�� �ٿ����Ѵ�.
}
