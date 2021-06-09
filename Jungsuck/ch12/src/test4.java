import java.util.ArrayList;
import java.util.Iterator;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());

		Iterator<Student> it = list.iterator();
		
		Student stu = it.next();
		
		System.out.println(stu);
		
	}

}

class Student {};

