package ch05;

import java.util.Arrays;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iarr = {100,95,80,70,60};				// ���̰� 5�� int�迭.
		
	    System.out.println(iarr);					// error�� �߻�. [I@3ac3fd8b  
		
		System.out.println(Arrays.toString(iarr));	// "[100,95,80,70,60]"�� ��µȴ�.
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i]);			// 100, 95, 80, 70, 60�� ��µȴ�.
		}
		
		int[] iArr1 = new int[10];
		char[] chArr = {'a','b','c','d'};
		
		
		for (int i=0; i<10; i++) {
			iArr1[i] = i + 1;
			System.out.println(iArr1[i]);			// 1,2,3,4,5,6,7,8,9,10 ���.
		}
		
		
		
	}

}
