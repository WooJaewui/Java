package ch02;

import javax.xml.crypto.Data;

import com.sun.net.httpserver.Authenticator.Success;

public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b= 128; error
//		byte b= 127; Success
//		boolean b = true; //success
		long b = 100_100_100_100L; //success
		b = 100; // ���� �ȿ��� ������ ���� data�� ����.
//		float c = 10e10f; // float 7�ڸ����� �ݿø��ؼ� ǥ��. success
//		double c = 1e6; // double 15�ڸ����� �ݿø��ؼ� ǥ��. success
//		int c = 02385; // 8������ ���� �ʴ� 8�� �� �־ error
		int c = 0b10101; // 10101 21 success
		c = 0x1A5;		// 421 success // A or a�� ��ҹ��� ������� ��밡���ϴ�.
		System.out.println(c);
	}

}
