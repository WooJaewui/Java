package ch04;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if (i%3==0) {					// 	3�ǹ��
				continue;					//	3�ǹ���� �ǳʶ��.
			}
			System.out.println(i);			// 	������� 3�� ����� ������ �ʴ´�.
		}
	}

}
