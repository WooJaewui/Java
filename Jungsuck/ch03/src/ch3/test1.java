package ch3;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		
		j = i++;
		System.out.println("i="+i+"j="+j);		// i = 6, j = 5
		
		i=5;
		j=0;
		
		j = ++i;
		System.out.println("i="+i+"j="+j);		// i = 6, j = 6
		
	}

}
