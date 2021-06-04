package test2;

public class InterfaceTest {
	public static void main(String[] args) {

		F f = new F();
		
		f.method(new G());			//	interface의 implement G class.
		f.method(new E());			//	interface의 implement E class.
	}
}

interface I{
	public void method();
}

class F{
	public void method(I i) {
		i.method();
	}
	
}

class E implements I{
	public void method() {
		System.out.println("E클래스의 메소드");
	}
}

class G implements I{
	public void method() {
		System.out.println("G클래스의 메소드");
	}
}


