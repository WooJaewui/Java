import java.text.DecimalFormat;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String str = "123.456";
			DecimalFormat df = new DecimalFormat("#.##E0");
			try {
				Number num = df.parse(str);
				System.out.println(num);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}

}
