import java.util.*;

import javax.swing.Box;

class Product3{};
class Tv3 extends Product3{};
class Audio3 extends Product3{}; 

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<? extends Product3> list = new TreeSet<Audio3>();
		
		Audio3 a3 = new Audio3();
		
//		list.add(new Audio3());			// 왜 안되는지 이유를 모르겠다.
//		list.add(a3);					// 왜 안되는지 이유를 모르겠다.
//		list.add(new Product3());		// 왜 안되는지 이유를 모르겠다.
//		list.add(new Tv3());			// 왜 안되는지 이유를 모르겠다.
		
	}

}


