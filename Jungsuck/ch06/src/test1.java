
public class test1 {
	public static void main(String args[]) {		// main method가 있는 class이름과
													// file name이 같아야 실행이된다.
		Tv t;										
		t = new Tv();								// class를 t(참조변수)에 대입. 객체생성.
		t.channel = 7;								// 변수사용. 객체사용.
		t.channelDown();							// 메소드사용. 객체사용.
		System.out.println(t.channel);				// 6	
	}
}

class Tv {											// class Tv. 설계도작성.
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

