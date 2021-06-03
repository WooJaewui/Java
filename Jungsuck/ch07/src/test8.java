
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv3 t3 = new SmartTv3();
		
		tv3 t4 = (tv3)t3;
		
		t4.a = 10;
		System.out.println(t4.a);
		System.out.println(t3.a);
		t3.b = 20;
		System.out.println(t4.b);				
		System.out.println(t3.b);
		
		
	}

}
class tv3 {
	int a;
	int b;
}


class SmartTv3 extends tv3{
	int c;
	int d;
}