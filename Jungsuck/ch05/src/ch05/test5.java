package ch05;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0f;
		int[] score = {100,88,100,100,90};
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum/(float)score.length;
		
		System.out.println(average);				// 95.6
		System.out.println(sum);					// 478
		
		
		System.out.println(10/1.5);					// 6.66666667;
		
	}

}
