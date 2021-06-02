
class constuct22 {
	public static void main() {
		
		construct2 date = new construct2();				// 기본생성자를 통해 생성자 호출.
		construct2 date2 = new construct2(2,3);			// 매개변수를 2개 넣어줘야 생성자가 호출된다.
		
	}
}

class construct2 {
	
	construct2(){};										// 기본생성자를 만들어준다.
	
	construct2(int x,int y){};							// 매개변수르 2개 넣어주는 생성자를 만든다.
}


