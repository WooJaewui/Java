package ch05;

import java.util.Arrays;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i<100; i++) {
			int n = (int)(Math.random()*10);	// 	0~9까지 숫자가 랜덤으로 나온다.
			int tmp = numArr[0];				// 	tmp에 numArr[0]의 값을 대입한다.
			numArr[0] = numArr[n];				// 	numArr[0]에 numArr[n]의 값을 대입한다.
			numArr[n] = tmp;					//	numArr[n]에 numArr[0]의 값을 대입한다.
		}										//  numArr[n]과 numArr[0]의 값을 바꿔주는방법.
		
		System.out.println(Arrays.toString(numArr));
	}

}
