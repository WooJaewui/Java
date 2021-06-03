
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.method();
	}

}

class parent { int x = 10; }

class child extends parent{
	
	int x = 20;
	
	void method() {
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}