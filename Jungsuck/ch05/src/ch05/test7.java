package ch05;

import java.util.Arrays;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i<100; i++) {
			int n = (int)(Math.random()*10);	// 	0~9���� ���ڰ� �������� ���´�.
			int tmp = numArr[0];				// 	tmp�� numArr[0]�� ���� �����Ѵ�.
			numArr[0] = numArr[n];				// 	numArr[0]�� numArr[n]�� ���� �����Ѵ�.
			numArr[n] = tmp;					//	numArr[n]�� numArr[0]�� ���� �����Ѵ�.
		}										//  numArr[n]�� numArr[0]�� ���� �ٲ��ִ¹��.
		
		System.out.println(Arrays.toString(numArr));
	}

}
