
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		
		d.x = 100;
		
		Data d2 = copy(d);						// 메소드에서 생성한 객체를 d2객체에 대입한다.
		
		System.out.println(d2.x);
		
	}
	static Data copy(Data d) {					// 공유 Data변수를 지정한다.
		
		Data tmp = new Data();					// 새로운 객체를 만든다.
		tmp.x = d.x;							// 새로운 객체에 매개변수를 대입한다.
							
		return tmp;								// 새로운 객체를 반환한다.
	}
}
