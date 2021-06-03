class Time{
	
	private int hour;				// 0~23사이의 값을 가져야함.
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
		System.out.println(t.gethour());		// 조건에 벗어나서 초기값 0;
		t.sethour(10);							
		System.out.println(t.gethour());		// 조건에 들어가서 int 10;
		t.sethour(200);							
		System.out.println(t.gethour());		// 조건에 벗어나서 기존에 있던 값 10;
		
	}

}
