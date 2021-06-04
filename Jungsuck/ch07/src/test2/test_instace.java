package test2;

public class test_instace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chi2 c2 = new chi2();
		if(c2 instanceof chi) {
			chi c = (chi)c2;
			System.out.println(c);
		}
	}

}

class chi { }

class chi2 extends chi{ }