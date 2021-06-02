
public class test5 {

	static void chance(int x) {				// static 공유 변수.
		
		x = 10000;
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data a = new Data();
		
		a.x = 10;
		
		System.out.println(a.x);
		
		change(a.x);
		
		chance(a.x);
		
		
		}
	static void change(int x) {
		
		x= 100;
		System.out.println(x);	
	}
	


}
