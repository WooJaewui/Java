class Point2D {
	
	int x;
	int y;
	
	int sum() {
		return x + y;
	}
	
}

class Point3D extends Point2D {
	
	int z;
	
	int sum() {
		return x + y + z;
	}
}


public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point2D p2 = new Point2D();
		Point3D p3 = new Point3D();
		
		p3.x = 10;							// Point2D���� ��ӹ��� x.
		p3.y = 20;							// Point2D���� ��ӹ��� y.
		p3.z = 100;							
											// Point2D���� ��ӹ������ ���´ٸ� x+y�� �� 30�� ���;ߵȴ�.
		System.out.println(p3.sum());		// Point3D���� �������̵��ؼ� x+y+z�� �� 130�� ���´�.
		
	}

}

