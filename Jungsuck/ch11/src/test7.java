import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test7 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("ÇÑ±Û");
		set.add("ÇÏ±Û");
		set.add("¾Þ±Û");
		set.add("À×±Û");
		
		System.out.println(set);
		
		Iterator iter  = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
