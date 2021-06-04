
public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abs a = new excu();						// 부모 참조변수에 자식 인스턴스 생성. (다형성 + 오버라이딩)
		
		a.method();								// 상속관계에 둘다 있는 method여서 부모 참조변수로도 사용가능하다.
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
		System.out.println(10);				// abstract stop method를 구현하지 않아서 error발생한다.
	}										// 메소드를 완성하던지, class에 abstract를 붙여야한다.
}
