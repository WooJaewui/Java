package test2;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AA (){};							// AA인터페이스를 조상으로 하는 익명클래스.
		new AB (){};							// AB클래스를 조상으로 하는 익명클래스.
		
	}

}
interface AA { }
class AB {}