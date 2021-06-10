
public class test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup t = new ThreadGroup("thread1");
		
		t.setMaxPriority(0);		
		
		Thread_1 t1 = new Thread_1();
		t1.start();
		
		Thread t2 = new Thread(t, new Thread_2());
		
		t2.start();
		
		System.out.println(t2.getPriority());
		
	}

}

class Thread_1 extends Thread{
	public void run(){
		for(int i=0; i<1; i++) {
			System.out.print(0);
		}
	};
}


class Thread_2 implements Runnable{
	public void run() {
		for(int i=0; i<1; i++) {
			System.out.print(1);
		}
		
	};
}
