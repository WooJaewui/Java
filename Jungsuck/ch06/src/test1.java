
public class test1 {
	public static void main(String args[]) {		// main method�� �ִ� class�̸���
													// file name�� ���ƾ� �����̵ȴ�.
		Tv t;										
		t = new Tv();								// class�� t(��������)�� ����. ��ü����.
		t.channel = 7;								// �������. ��ü���.
		t.channelDown();							// �޼ҵ���. ��ü���.
		System.out.println(t.channel);				// 6	
	}
}

class Tv {											// class Tv. ���赵�ۼ�.
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

