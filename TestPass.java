
public class TestPass{
	public static void main (String ... args){
	//Demo 1
	/*
	int x = 10;
	int y = x;
	double z = x;
	x = (int) z;
	
	System.out.println(z);
	
	//Demo 2
	Person0 p = new Person0("Kyaru");
	//p.setName("Kyaru");
	p.showDetails();
	
	String s = p.getName();
	System.out.println(s);
	*/
	
	//Demo 3 Pass the value of the integer
	int num = 50;
	
	changeIntVal(num);
	
	//Demo 4 Change the object reference value
	Person0 p1 = new Person0 ("Sakayanagi", 17);
	changeObjectRef(p1);
	changeObjectAttr(p1);
	p1.showDetails();
	
	// Demo 5 Passing an object to constructor
	Person0 olderPerson = p1.addAge(15);
	olderPerson.showDetails();
	//System.out.println();
	}
	
	public static void changeIntVal(int n){
		n = 100;
		System.out.println(n);
	}
	
	public static void changeObjectRef(Person0 p){
		p = new Person0 ("Arisu", 16);
		p.showDetails();
	}
	
	public static void changeObjectAttr(Person0 p){
		p.setName("Fufu");
		
	}
}