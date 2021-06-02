
public class thisis {
	
	String color;
	String gearType;
	int price;
	
	
	thisis(){
		this("white","auto",1300);
	}
	
	thisis(int p){
		this("Black","auto",p);
	}
	
	thisis(String c, String g, int p){
		
		color = c;
		gearType = g;
		price = p;
		
	}
	
}
