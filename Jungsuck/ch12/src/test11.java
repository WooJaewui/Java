enum Direction2{
	South(1), East(5);
	
	private final int value;
	int num;
	
	Direction2(int value) {
		this.value = value;
	}
	
	public int getValue() { return value; }
	
	public int rotate2(int num) {
		
		num = num%2;
		if (num<0) num = num + 2;
		
		return num;
		
	}

}


public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Direction2 dir = new Direction2();		(Error)
		
		Direction2 dir = Direction2.East;
		Direction2 dir2 = Direction2.South;
		
		System.out.println(dir.getValue());
		System.out.println(dir2.getValue());
		
		System.out.println(dir.ordinal());
		System.out.println(dir2.ordinal());
		System.out.println(dir.name());
		System.out.println(dir2.name());
		
		System.out.println();
		
		
	}

}
