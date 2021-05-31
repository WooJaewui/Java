package ch05;

import java.util.Arrays;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<5; i++) {						// 10번 반복.
			int ran = (int)(Math.random()*3);			// 0~2까지 숫자중에 랜덤하게 나온다.
			System.out.println(strArr[ran]);			// 가위, 바위, 보 중에 랜덤하게 나온ㄷ
		}
		
	}

}
