package test1;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = { new Marine(), new suttle() };
		
		group[0].move(10,20);
		group[1].stop();
	}

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
	
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("x �������� "+x+", y �������� "+y);
	}
	void stop() {
		System.out.println("�����մϴ�.");
	}
}

class suttle extends Unit {
	void move(int x, int y) {
		System.out.println("x �������� "+x+", y �������� "+y);
	}
	void stop() {
		System.out.println("�����մϴ�.");
	}
}
