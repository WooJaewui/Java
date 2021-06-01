
public class MyMath {
	
	void printGugudan(int dan) {
		
		if(!(2<=dan && dan<=9))
			return;
		for(int i=1; i<=9; i++) {
			System.out.println(dan*i);
			
		}
		
	}
	
	
	long add(long a, long b) {
		long result = a + b;
		return result;
		
	}
	long minus(long a, long b){
		long result = a-b;
		return result;
	}
	
	int max (int a, int b) {
		return a > b ? a : b;
		
	}
	
	int min (int a, int b ) {
		
		return a < b ? a:b;
	}
	
}
