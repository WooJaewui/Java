
public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product2 P[] = new Product2[5];
		
		P[1] = new computer2();
		
		Product2 P2[] = {new computer2(), new computer2(), new Audio()};		// ½Ô°¡´É.
		
	}

}

class Product2 {
	int a;
}

class computer2 extends Product2 {
	int b;
}

class Audio extends Product2 {}

