package ch05;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				
				{100,100,100},
				{20,20,20,20},							// table의 행 갯수가 다를 수 있다.
				{30,30},								
				{40}
		};
		
		int sum = 0;
		
		for(int i=0; i< score.length; i++) {			// score.length = table행의 값.
			for(int j=0; j< score[i].length; j++) {		// score[i].length = table열의 값.
				
				System.out.println(score[i][j]);		// 2차배열에 있는 모든 수 확인.
				
				sum += score[i][j];						// score[i][j] = 배열의 모든 수.  
			}
		}
		
		System.out.println(sum);
		
		
	}

}
