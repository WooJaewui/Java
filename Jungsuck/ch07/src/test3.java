

class MyMath extends Object{				// �θ� �������� ������ compiler�� �ڵ����� extends Object�� �����ȴ�.
	
	int x;
	int y;
}


public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath m = new MyMath();
		
		m.x = 10;
		
		System.out.println(m.toString());		//	"MyMath@2401f4c3"	���ڿ� ��ȯ.
		System.out.println(m);					//	"MyMath@2401f4c3" 	

//		println �޼ҵ忡 ���������� ������ toString()�� ���� ������ �Ѵ�.
		
	}
}
