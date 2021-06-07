import java.util.Calendar;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long[] Time = {3600,60,1};
		
		final String[] Time_str = {"�ð�","��","��"};

		String tmp = "";
		
		
		Calendar date = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, 5);
		date.set(Calendar.DATE, 7);
		
		date2.set(2021,5,10);
		
		long k = Math.abs(date.getTimeInMillis()-date2.getTimeInMillis()); 
		
		System.out.println(k/1000);
		
		for (int i=0; i<Time.length; i++) {
			
			tmp += (k/1000/Time[i])+Time_str[i];
			k %= Time[i]; 
		}
		
		System.out.println(tmp);
	}

}
