import java.util.*;

import javax.swing.Box;

class Product3{};
class Tv3 extends Product3{};
class Audio3 extends Product3{}; 
class Cart<T>{};

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart<? extends Object> list = new Cart<Integer>();
		
		Audio3 a3 = new Audio3();
//		list.add(3);	
//		list.add(new Audio3());			// �� �ȵǴ��� ������ �𸣰ڴ�.
//		list.add(a3);					// �� �ȵǴ��� ������ �𸣰ڴ�.
//		list.add(new Product3());		// �� �ȵǴ��� ������ �𸣰ڴ�.
//		list.add(new Tv3());			// �� �ȵǴ��� ������ �𸣰ڴ�.
		
		
		
	}

}


