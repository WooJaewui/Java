import java.util.*;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {80,95,50,120,20,50,21};
		
		TreeSet set = new TreeSet<>();
		
		for (int i=0; i<score.length; i++) {
			
			set.add(score[i]);
		}
		
		System.out.println(set);
		System.err.println(set.headSet(50));
		System.err.println(set.tailSet(50));
		
		
		
	}

}
