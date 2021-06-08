import java.util.*;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		
		set.add("ABC");
		set.add("qasd");
		set.add("asdf");
		set.add("zxvc");
		set.add("wertC");
		set.add("weC");
		set.add("bbC");
		set.add("bwer");
		set.add("dqwe");
		set.add("dqsdf");
		
		System.out.println(set);
		
		System.out.println(set.subSet("b","dzzz"));
		

	}

}
