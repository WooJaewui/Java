import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test7 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("�ѱ�");
		set.add("�ϱ�");
		set.add("�ޱ�");
		set.add("�ױ�");
		
		System.out.println(set);
		
		Iterator iter  = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
