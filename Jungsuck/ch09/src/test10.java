
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("ABCD");
		
		String s = sb.substring(2);
		String s2 = sb.substring(1,3);
		
		StringBuffer sb2 = sb.append("¾È³çÇÏ½´~").delete(2, 6);
		
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(sb2);			// "ABCD¾È³çÇÏ½´~" => "ABÇÏ½´~"
		
	}

}
