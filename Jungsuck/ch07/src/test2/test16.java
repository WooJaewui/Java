package test2;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class b implements d{ public void method10(){}}	// b class�� �ƴ϶� ���ο� implements class�� ���� �� �ִ�.
												
class c{ void method11(d D){ D.method10(); }}	// implements class�� �ٲ��� interface�� �Ű������� �ް� �־
												// code�� ���� �ٲ��� �ʾƵ� �ȴ�.
interface d { void method10(); }
