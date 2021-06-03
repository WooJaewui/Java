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
		
		p3.x = 10;							// Point2D에서 상속받은 x.
		p3.y = 20;							// Point2D에서 상속받은 y.
		p3.z = 100;							
											// Point2D에서 상속받은대로 나온다면 x+y의 값 30이 나와야된다.
		System.out.println(p3.sum());		// Point3D에서 오버라이딩해서 x+y+z의 값 130이 나온다.
		
	}

}

