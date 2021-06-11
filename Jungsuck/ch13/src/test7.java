
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Thread7 implements Runnable{
	
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	Thread7(String name){
		th = new Thread(this, name);
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend(){
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(10);
			}
		}
	}
	
	
}