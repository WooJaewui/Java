package ch05;

import java.util.Arrays;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"����","����","��"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<5; i++) {						// 10�� �ݺ�.
			int ran = (int)(Math.random()*3);			// 0~2���� �����߿� �����ϰ� ���´�.
			System.out.println(strArr[ran]);			// ����, ����, �� �߿� �����ϰ� ���¤�
		}
		
	}

}
