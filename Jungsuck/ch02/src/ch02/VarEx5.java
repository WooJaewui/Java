package ch02;

public class VarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char ch = 'A'; // success
//		ch = 'AB';	   // error ���ڿ��� ����ؾ� �ȴ�.
		String ch = "AB";   // success
		ch = "" + 7 + 7;  // success "77"
		ch = 7 + 7 + "";  // success "14"
		System.out.println(ch);
	}

}
