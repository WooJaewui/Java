package ch05;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEF";
		
		System.out.println(str);
		System.out.println(str.substring(2,5));		//	CDE	2~4��° ���� ���.
		System.out.println(str.charAt(3));			//	D	3��° ���� ���.
		System.out.println(str.length());			// 	string�� ����.
		System.out.println(str.equals("ABCDEF"));	
		System.out.println(str.toCharArray());
	}

}
