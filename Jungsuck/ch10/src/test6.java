import java.text.SimpleDateFormat;
import java.util.Date;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {	
			Date d = sdf.parse("2020-11-23");
			System.out.println(sdf.format(d));	
		} catch (Exception e){};
	}
	
}
