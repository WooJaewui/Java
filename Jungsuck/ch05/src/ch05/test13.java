package ch05;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEF";
		
		System.out.println(str);
		System.out.println(str.substring(2,5));		//	CDE	2~4번째 글자 출력.
		System.out.println(str.charAt(3));			//	D	3번째 글자 출력.
		System.out.println(str.length());			// 	string에 길이.
		System.out.println(str.equals("ABCDEF"));	
		System.out.println(str.toCharArray());
	}

}
