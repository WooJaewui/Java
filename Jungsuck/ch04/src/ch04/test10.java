package ch04;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 0;
		
		while(true) {								//���ѹݺ�
			if(sum>10) {
				break;
			}
			
			++i;
			sum += i;	
			System.out.println(sum);
			
		}
		
	}

}
