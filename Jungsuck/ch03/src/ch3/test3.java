package ch3;


public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long result = Math.round(4.52);
//		
//		System.out.println(result);
		
		double pi = 3.141592;
		
		System.out.println(pi);							//	3.141592
		System.out.println(pi*1000);					//  3141.592
		System.out.println(Math.round(pi*1000));		//	3142	
		System.out.println(Math.round(pi*1000)/1000);	//	3     	  int/int = int
		
		System.out.println(pi*1000);					//  3141.592
		System.out.println((int)(pi*1000));				//  3141
		System.out.println((int)(pi*1000)/1000.0);		//  3.141
		
		
		
	}

}
