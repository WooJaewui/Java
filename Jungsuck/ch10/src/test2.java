import java.util.Calendar;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
			
		int i = cal.get(Calendar.YEAR);
		int i2 = cal.get(Calendar.MONTH);
		int i3 = cal.get(Calendar.DATE);
		int i4 = cal.get(Calendar.DAY_OF_WEEK);
		int i5 = cal.get(Calendar.HOUR_OF_DAY);
		int i6 = cal.get(Calendar.MINUTE);
		int i7 = cal.get(Calendar.SECOND);
		
//		System.out.println(i);
//		System.out.println(i2+1);
//		System.out.println(i3);
//		System.out.println(i4);
//		System.out.println(i5);
//		System.out.println(i6);
//		System.out.println(i7);
		System.out.printf("%dY %dM %dD %d:%d:%d", i,i2+1,i3,i5,i6,i7);
			
	}

}
