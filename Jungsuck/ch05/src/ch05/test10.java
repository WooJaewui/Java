package ch05;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				
				{100,100,100},
				{20,20,20,20},							// table�� �� ������ �ٸ� �� �ִ�.
				{30,30},								
				{40}
		};
		
		int sum = 0;
		
		for(int i=0; i< score.length; i++) {			// score.length = table���� ��.
			for(int j=0; j< score[i].length; j++) {		// score[i].length = table���� ��.
				
				System.out.println(score[i][j]);		// 2���迭�� �ִ� ��� �� Ȯ��.
				
				sum += score[i][j];						// score[i][j] = �迭�� ��� ��.  
			}
		}
		
		System.out.println(sum);
		
		
	}

}
