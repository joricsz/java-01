public class Person{
	public String name;
	public int age;

	//Constructors
	public Person(String n, int a){
		this.name = n;
		this.age = a;
	}
	public Person(Person per){
		this.name = per.name;
		this.age = per.age;
	}
	
	//Methods
	
	public Person addAge(int addAge){
		Person newPerson = new Person(this);
		newPerson.age = newPerson.age + addAge;
		//newPerson.name = newName;	
		return newPerson;
	}
	
	public String toString(){
		return "Name: " + getName() + "\tAge: " + getAge();
		
	}

	public void showDetails(){
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	//Setters or Mutators
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	//Getters
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
}