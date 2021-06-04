
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Buyer b = new Buyer();			// ����.
		Product p = new Product();		// ����.
		Computer c = new Computer();
		
		p.buy(c);						// �ڽ� �ν��Ͻ��� argument���� �ִ´�. 
		p.buy(new Computer());			// �ڽ� �ν��Ͻ��� argument���� �ִ´�.
		System.out.println(p.money);	
		
	}
}


class Product {
	int price;
	int bonusPoint;
	int money = 1000;
	
	Product(){};
	
	Product(int p){
		this.price = p;
		this.bonusPoint = (int)(p/10);
	}
	
	void buy (Product p) {				// �θ� ���������� �Ű������� ���Ѵ�.
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
	
}

class Computer extends Product {
	Computer(){
		super(100);
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy (Product p) {				// �θ� ���������� �Ű������� ���Ѵ�.
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
}



