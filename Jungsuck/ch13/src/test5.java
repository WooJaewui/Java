
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th2 t = new th2();
		
		t.start();
		
//		t.interrupt();
		
		System.out.println(t.isInterrupted());
		System.out.println();
	}

}

class th2 extends Thread{
	
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.print("¾È´¨");
			try {
				Thread.sleep(3*1000);
				System.out.println(Thread.interrupted());
			}catch(Exception e) {}
			
		}
	}
	
}