package test2;

public class test1 {

	public 		int pub;
	protected 	int pro;
				int def;
	private		int pri;
	
	public void t () {
		
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
	
}

class test2{
	
	test1 t1 = new test1();
	
	public void t () {
		System.out.println(t1.pub);
		System.out.println(t1.pro);
		System.out.println(t1.def);
//		System.out.println(t1.pri);
	}
	
}
