package ch05;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		
		
		for (int i=0; i<=score.length-1; i++) {		// score.length-1 or <·Î ¹Ù²ãÁà¾ßµÈ´Ù.
			System.out.println(score[i]);			// index°ªÀº 0~n-1
		}
	}

}
