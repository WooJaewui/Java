
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv2 t = new SmartTv2();
//		SmartTv2 t2 = new Tv2();		// error  �ڼ� Ÿ������ �θ��ν��Ͻ��� ���� �� ����.
		
		
//		t.e = 10;						// error  e�� �ڼ� class�� �ִ� ������ �θ� type���� ���� �ν��Ͻ��δ� �ٲ� �� ����.
		
		SmartTv2 t2 = (SmartTv2)t;		// SmartTv2 type�� t2�� SmartTv2�ν��Ͻ��� ����Ű�� t�� �����Ѵ�. ���� �ν��Ͻ��� ����Ų��. 
		Tv2 t3 = (Tv2)t2;				// Tv2 type�� t3�� SmartTv2�ν��Ͻ��� ����Ű�� t2�� �����Ѵ�. ��� 5���� ����. 
										// t = ��� 5��, t2 = ��� 7��,  t3 = ��� 5��   �� �� ���� �ν��Ͻ��� �޸𸮸� ����Ű�� �ִ�.
		
		t3.a = 10;						// ������ ������ ���԰���.
//		t3.f = 100;						// error 
		
		Tv2 t4 = new Tv2();
		
//		SmartTv2 t5 = (SmartTv2)t4;		// error ��� 5���� �θ� �ν��Ͻ��� ����Ű�� t4�� ��� 7���� type�ڽ� ���������� ���� �� �� ����.
										
	}
}

class Tv2{
	 int  a;
	 int  b;
	 int  c;
	 int  d;
}
class SmartTv2 extends Tv2{
	protected int e;
	protected int f;
}

