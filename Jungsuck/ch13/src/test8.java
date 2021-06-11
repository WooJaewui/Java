
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread8_1 t8_1 = new Thread8_1();
		Thread8_2 t8_2 = new Thread8_2();
		
		t8_1.start();
		t8_2.start();
		
		try {
			t8_1.join();
			t8_2.join();
		}catch(InterruptedException e) {}
		
		System.out.println("소요시간");
		
		
	}

}


class Thread8_1 extends Thread{
	
	public void run() {
		for(int i=0; i<200; i++) 
			System.out.print("1");
	}
}

class Thread8_2 extends Thread{
	
	public void run() {
		for(int i=0; i<200; i++) 
			System.out.print("0");
	}
}
