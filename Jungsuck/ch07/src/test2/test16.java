package test2;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class b implements d{ public void method10(){}}	// b class가 아니라 새로운 implements class가 생길 수 있다.
												
class c{ void method11(d D){ D.method10(); }}	// implements class가 바껴도 interface를 매개변수로 받고 있어서
												// code를 따로 바꾸지 않아도 된다.
interface d { void method10(); }
