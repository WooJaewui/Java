package ch04;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=1; i<=5; i++) {
					for(int k=1; k<=5; k++) {
						if(k==2) {
							System.out.println(k);
							break Loop1;
						}
						System.out.println(k);
					}
		}
	}

}
