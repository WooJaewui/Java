package test1;

import test2.test1;

public class test2 {

	public static void main(String[] args) {
		
		test1 t1 = new test1();
	
		System.out.println(t1.pub);			// �ƹ��볪.
//		System.out.println(t1.pro);			// ���� ��Ű�� + �ٸ� ��Ű���� �ڼ�Ŭ����.
//		System.out.println(t1.def);			// ���� ��Ű��.
//		System.out.println(t1.pri);			// ���� Ŭ����.
		
	}

}

class test3 extends test1 {					// �ٸ� ��Ű�� Ŭ������ �ڼ��� �ȴ�.
	public void t () {
		System.out.println(pub);			// �ƹ��뼭�� ����.
		System.out.println(pro);			// ���� ��Ű�� + �ٸ� ��Ű���� �ڼ�Ŭ�������� ��밡���ϴ�.
//		System.out.println(def);			// ���� ��Ű��.
//		System.out.println(pri);			// ���� Ŭ����.
	}
}
