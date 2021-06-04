
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Buyer b = new Buyer();			// 가능.
		Product p = new Product();		// 가능.
		Computer c = new Computer();
		
		p.buy(c);						// 자식 인스턴스를 argument으로 넣는다. 
		p.buy(new Computer());			// 자식 인스턴스를 argument으로 넣는다.
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
	
	void buy (Product p) {				// 부모 참조변수를 매개변수로 정한다.
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
	
	void buy (Product p) {				// 부모 참조변수를 매개변수로 정한다.
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
}



