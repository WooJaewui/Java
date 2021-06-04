
public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer3 b = new Buyer3();
		
		Computer3 c = new Computer3();
		b.buy(c);
		b.buy(new Computer3());
		
		System.out.println(c.price);
		System.out.println(b.money);
		System.out.println(b.Bonus);
		System.out.println(b.cart[0].Bonus);
		System.out.println(b.cart[1].price);
		System.out.println(b.cart[1].toString());
		
	}	

}

class Product3{
	
	int price = 0;
	int Bonus = 0;

	Product3(){};
	Product3(int pri){
		price = pri;
	}
	
	
}

class Computer3 extends Product3{
	Computer3(){super(100);}
	
	public String toString() { return "Computer"; }			// toString()하면 "Computer"로 반환한다.
}

class Buyer3 {
	
	int money = 1000;
	int Bonus = 0;
	int i = 0;
	
	Product3 cart[] = new Product3[10];
	
	void buy (Product3 p){
		
		this.money -= p.price;
		this.Bonus += (int)(p.price/10);
		
		cart[i++] = p;
	}
}



