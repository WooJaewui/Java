
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread6 t6 = new Thread6();
		t6.start();
		System.out.println(t6.isInterrupted());
		t6.interrupt();
		System.out.println(t6.isInterrupted());
		
	}

}

class Thread6 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			
			System.out.println(i--);
			try {
				Thread6.sleep(10*1000);
			}catch(Exception e) {}
		}
		
		
	}
	
	
}