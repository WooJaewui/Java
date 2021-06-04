package test2;

public class InterfaceTest {
	public static void main(String[] args) {

		F f = new F();
		
		f.method(new G());			//	interface�� implement G class.
		f.method(new E());			//	interface�� implement E class.
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
		System.out.println("EŬ������ �޼ҵ�");
	}
}

class G implements I{
	public void method() {
		System.out.println("GŬ������ �޼ҵ�");
	}
}


