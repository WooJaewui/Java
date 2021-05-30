package ch04;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if (i%3==0) {					// 	3의배수
				continue;					//	3의배수를 건너띈다.
			}
			System.out.println(i);			// 	결과값에 3의 배수가 나오지 않는다.
		}
	}

}
