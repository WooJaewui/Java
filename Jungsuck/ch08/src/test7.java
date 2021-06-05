
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new person() {
			void method(){
				System.out.println(10);
			}
		};
		
		System.out.println(new person() {
			void method(){
				System.out.println(10);
			}
		});
		
		
	}
		
}

class person{}