
class Point10{
	int x;
	int y;
	
}

class Circle extends Point10{
	
	int r;
}

class Circle2 {
	Point10 p = new Point10();
	int r;
}


public class test2 {

	public static void main(String[] args) {
		
			Circle c = new Circle();				// ���.
			
			c.x = 1;
			c.y = 2;
			c.r = 3;
			System.out.println(c.x);
			System.out.println(c.y);
			System.out.println(c.r);
			
			Circle2 c2 = new Circle2();				// ����.
			
			c2.p.x = 1;								// ���Ե� ��ü�� ����.
			c2.p.y = 2;								// ���Ե�	��ü�� ����.
			c2.r = 3;								
			
			System.out.println(c2.p.x);
			System.out.println(c2.p.y);
			System.out.println(c2.r);	
			
	}
}
