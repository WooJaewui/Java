package test1;

import test2.test1;

public class test2 {

	public static void main(String[] args) {
		
		test1 t1 = new test1();
	
		System.out.println(t1.pub);			// 아무대나.
//		System.out.println(t1.pro);			// 같은 패키지 + 다른 패키지의 자손클래스.
//		System.out.println(t1.def);			// 같은 패키지.
//		System.out.println(t1.pri);			// 같은 클래스.
		
	}

}

class test3 extends test1 {					// 다른 패키지 클래스에 자손이 된다.
	public void t () {
		System.out.println(pub);			// 아무대서나 가능.
		System.out.println(pro);			// 같은 패키지 + 다른 패키지의 자손클래스에서 사용가능하다.
//		System.out.println(def);			// 같은 패키지.
//		System.out.println(pri);			// 같은 클래스.
	}
}
