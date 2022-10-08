
public class TestPerson1{
	public static void main(String ... args){
		//declare and insantiate;
		Person1 p1 = new Person1();
		
		//declare
		Person1 p2;
		//insantiate;
		p2 = new Person1();
		Person1 p3 = new Person1();
		Person1 p4 = new Person1("Kyaru",17);
		//Assign values for p1 and p2
		/*p1.name="Itsuki";
		p2.name="Fumino";
		
		p1.age=18;
		p2.age=18;
		*/
		p1.setName("Koroster");
		p2.setName("Pecorine");
		
		p1.setAge(18);
		p2.setAge(-5);
		p3.setName("Shizuru");
		p3.setAge(20);
		
		//Display values
		/*
		System.out.println(p1.name + " at age " + p1.age);
		System.out.println(p2.name + " at age " + p2.age);
		*/
		p1.showDetails();
		p2.showDetails();
		//p3.showDetails();
		System.out.println(p3.getName() + " at age " + p3.getAge());
		p4.showDetails();
	}
}