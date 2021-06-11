
public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread9 t = new Thread9();
		
		new Thread(t).start();
		new Thread(t).start();
		
	}

}

class Account {
	private int coin = 1000;
	
	public int getCoin () {
		return coin;
	}
	
	public void setCoin(int money) {
		
		if(coin>=money) {
			coin -= money;
		}
	}
}

class Thread9 implements Runnable {
	Account acc = new Account();
	
	public void run(){
		while(acc.getCoin() > 0) {
			acc.setCoin(100);
			System.out.println(acc.getCoin());
		}
	}
}



