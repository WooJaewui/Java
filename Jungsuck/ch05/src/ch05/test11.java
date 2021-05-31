package ch05;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{1, 100,100,100},
				{2, 20,20,20},
				{3, 30,30,30},
				{4, 40,40,40},
				{5, 50,50,50}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int k=1; k<score[i].length; k++) {
				
				sum += score[i][k];
				
			}
		}
		
		System.out.println(sum);
		System.out.println(sum/15f);
		
	}

}
