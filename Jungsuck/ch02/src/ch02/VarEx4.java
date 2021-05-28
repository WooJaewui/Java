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
		b = 100; // 범위 안에만 있으면 작은 data도 성공.
//		float c = 10e10f; // float 7자리까지 반올림해서 표현. success
//		double c = 1e6; // double 15자리까지 반올림해서 표현. success
//		int c = 02385; // 8진법에 맞지 않는 8이 들어가 있어서 error
		int c = 0b10101; // 10101 21 success
		c = 0x1A5;		// 421 success // A or a로 대소문자 상관없이 사용가능하다.
		System.out.println(c);
	}

}
