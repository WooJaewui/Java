import java.util.*;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet(); 
		
		set.add("abc");
		
		set.add(new Person("Davit",20));
		set.add(new Person("Davit",20));
		set.add(new Person("Davit",20));
		
		System.out.println(set);
	}

}


class Person {
	String name;
	int age;
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))  return false;
		
		Person p = (Person)obj;

		return this.name.equals(p.name) && this.age == p.age;

	}
	
	Person(){};
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	
	
}