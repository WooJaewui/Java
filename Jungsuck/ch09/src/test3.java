
public class test3 {
	
	int value;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}
	public boolean equals(Object obj) {
		if (obj instanceof test3) {
			test3 t3 = (test3)obj;
			return this.value==t3.value;
		} else return false;
	}
}
