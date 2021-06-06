
public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("ABCDEFG");
		
		sb.setLength(50);
		System.out.println(sb);
		
		String s = sb.toString().trim();
		
		System.out.println(s);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
	}

}
