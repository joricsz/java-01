
public class TestPerson{
	public static void main(String...args){
		//Person p1 = new Person();
		//Person p2 = new Person();
		Person p3 = new Person("Christopher",30);
		
		String name;
	
		/*
		p1.name = "Chris";
		p2.setName("Topher");
		
		p1.age = 20;
		p2.setAge(25);

		p1.showDetails();
		p2.showDetails();
		*/
		
		System.out.println("name: " + p3.getName() + "\tage: " + p3.getAge());
		
		Person olderPerson = p3.addAge(10);
		System.out.println(olderPerson);
	}
}