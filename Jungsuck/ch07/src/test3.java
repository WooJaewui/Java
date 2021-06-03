

class MyMath extends Object{				// 부모를 지정하지 않으면 compiler가 자동으로 extends Object가 생성된다.
	
	int x;
	int y;
}


public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath m = new MyMath();
		
		m.x = 10;
		
		System.out.println(m.toString());		//	"MyMath@2401f4c3"	문자열 반환.
		System.out.println(m);					//	"MyMath@2401f4c3" 	

//		println 메소드에 참조변수를 넣으면 toString()과 같은 역할을 한다.
		
	}
}
