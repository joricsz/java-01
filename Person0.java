 public class Person0{
	//instance variables
	private String name;
	private int age;
	
	//Constructor
	public Person0(){
		
	}

	public Person0(String name, int age){
		this.name = name; //instance variable
		this.age= age;
	}
	
	public Person0(Person0 p){
		this.name = p.name;
		this.age = p.age;
	}

	//Setter
	public void setName(String name){
		this.name = name;
	}

	//Getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	//Other methods
	
	public Person0 addAge(int moreAge){
		Person0 newP = new Person0(this); //this is p1
		newP.age += moreAge;
		return newP;		
	}
	
	public void showDetails(){
		System.out.println(getName()+ ", at age " + getAge());
	}
 }