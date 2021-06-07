import java.util.Calendar;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		cal.clear();
		cal.set(Calendar.MONTH, 5);
		cal.add(Calendar.MONTH, 10);
		
		System.out.println(cal.MONTH);
		
		cal.clear();
		
		cal.set(2020,10,5);

		System.out.println(cal.YEAR);
		System.out.println(cal.MONTH);
		System.out.println(cal.DATE);
			
	}

}
