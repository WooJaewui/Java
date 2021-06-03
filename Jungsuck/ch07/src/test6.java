
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv2 t = new SmartTv2();
//		SmartTv2 t2 = new Tv2();		// error  자손 타입으로 부모인스턴스를 만들 수 없다.
		
		
//		t.e = 10;						// error  e는 자손 class에 있는 변수로 부모 type으로 만든 인스턴스로는 바꿀 수 없다.
		
		SmartTv2 t2 = (SmartTv2)t;		// SmartTv2 type에 t2에 SmartTv2인스턴스를 가르키는 t를 대입한다. 같은 인스턴스를 가르킨다. 
		Tv2 t3 = (Tv2)t2;				// Tv2 type에 t3에 SmartTv2인스턴스를 가르키는 t2를 대입한다. 멤버 5개로 줄음. 
										// t = 멤버 5개, t2 = 멤버 7개,  t3 = 멤버 5개   셋 다 같은 인스턴스의 메모리를 가르키고 있다.
		
		t3.a = 10;						// 조상의 변수는 대입가능.
//		t3.f = 100;						// error 
		
		Tv2 t4 = new Tv2();
		
//		SmartTv2 t5 = (SmartTv2)t4;		// error 멤버 5개인 부모 인스턴스를 가르키는 t4를 멤버 7개의 type자식 참조변수에 대입 할 수 없다.
										
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

