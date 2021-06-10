
enum Direction {East, South, West, North};

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Direction d1 = Direction.East;
			Direction d2 = Direction.South;
			
			System.out.println(Direction.East);
			
			System.out.println(d1 == d2);
			System.out.println(d1.compareTo(d2));
			System.out.println(d1.equals(d2));
			
			Direction[] darr = Direction.values();
			
				
			for (Direction d : darr) {
				
				System.out.printf("%s = %d,%n" , d.name() , d.ordinal());

			}
			

			
			
	}

}
