
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_3 t1 = new Thread_3();
		
		Thread t2 = new Thread(new Thread_4());
		
		Thread t3 = new Thread(new Thread_5());
		
		
		
		t3.setPriority(10);
		t2.setPriority(1);
		t1.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t2.getPriority());
		
		try {
			t3.join();
		} catch(Exception e) {
			System.out.println(e);
		}
	
	}

}

class Thread_3 extends Thread{
	public void run(){
		for(int i=0; i<100; i++) 
			System.out.print('1');
	}
	
}

class Thread_4 implements Runnable{
	public void run() {
		for(int i=0; i<100; i++)
			System.out.print('2');
	}
}

class Thread_5 implements Runnable{
	public void run() {
		for(int i=0; i<100; i++) 
			System.out.print('3');
	}
	
	
}
