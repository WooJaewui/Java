
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		
		d.x = 100;
		
		Data d2 = copy(d);						// �޼ҵ忡�� ������ ��ü�� d2��ü�� �����Ѵ�.
		
		System.out.println(d2.x);
		
	}
	static Data copy(Data d) {					// ���� Data������ �����Ѵ�.
		
		Data tmp = new Data();					// ���ο� ��ü�� �����.
		tmp.x = d.x;							// ���ο� ��ü�� �Ű������� �����Ѵ�.
							
		return tmp;								// ���ο� ��ü�� ��ȯ�Ѵ�.
	}
}
