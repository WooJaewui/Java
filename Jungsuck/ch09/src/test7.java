
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s = "dog,cat,bear";
		String[] arr = s.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String s2 = String.join("=>",arr);
		System.out.println(s2);
 		
		
	}

}
