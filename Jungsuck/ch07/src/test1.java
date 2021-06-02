class tv {
	boolean power;
	int channel;
}

class smartTv extends tv{
	boolean caption;

}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartTv sTv1 = new smartTv();
		
		sTv1.channel = 10;
		
		System.out.println(sTv1.channel);
		System.out.println(sTv1.power);
		System.out.println(sTv1.caption);
	}

}

