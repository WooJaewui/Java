
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread au = new Thread(new Auto());
		
		au.setDaemon(true);
		
		au.start();
		
//		au.setDaemon(true);			//     IllegalThreadStateException
		
		System.out.println(au.isDaemon());
	}

}



class Auto implements Runnable{
	
	public void run(){
//		while(true) {
//			Thread.sleep(10 * 1000);
//		} if()
		System.out.println(123);
	}
	
}