package ch02;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";
		
		System.out.println('3'-'0');   		 			//   3
		System.out.println(str.charAt(0));   			//  '3'
		System.out.println('3' - '0' + 1);   			//   4
		System.out.println(Integer.parseInt(str));     	//   3
		System.out.println(Double.parseDouble(str));    //   3.0
		System.out.println((char)(3 + '0') + "A");    	//   3A
		System.out.println("A"+'b');    				//   Ab
		
	}

}
