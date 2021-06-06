
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c = new Card();
		
		System.out.println(c.toString());
		
		
	}

}

class Card {
	
	int a = 10;
	String s = "200";
	
	public String toString(){
		return "정수 = " + a + ", 문자 = " + s;
	}
	
}