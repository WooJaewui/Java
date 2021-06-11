
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_1 t1 = new Thread_1();
		
		t1.start();

		try {
			Thread.sleep(1*1000);
		}catch(InterruptedException I) {}
		
		delay(1000);
	}
	
	static void delay(long milli) {
		try {
			Thread.sleep(milli);
		}catch(InterruptedException I) {}
	}
	

}
