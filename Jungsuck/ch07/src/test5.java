class Time{
	
	private int hour;				// 0~23������ ���� ��������.
	private int minute;
	private int second;
	
	public void sethour(int a) {
		if ( 0>a || a>23) return;
			
		this.hour = a;
	}
	
	public int gethour() {
		
		return this.hour;
	}
}

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		t.sethour(24);							
		System.out.println(t.gethour());		// ���ǿ� ����� �ʱⰪ 0;
		t.sethour(10);							
		System.out.println(t.gethour());		// ���ǿ� ���� int 10;
		t.sethour(200);							
		System.out.println(t.gethour());		// ���ǿ� ����� ������ �ִ� �� 10;
		
	}

}
