import java.util.*;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product());
		list.add(new Tv2());
		list.add(new Audio2());
		
		Tv2 t = (Tv2)list.get(1);
		
		Product p = list.get(0);
		Tv2 p2 = (Tv2)list.get(1);
		Audio2 p3 = (Audio2)list.get(2);
		
		
		System.out.println(t);
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
	}

}

class Product{}

class Tv2 extends Product{}
class Audio2 extends Product{}



