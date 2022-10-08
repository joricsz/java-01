//Constructor should have the same name as the class
public class Person1{
	//variables or attributes
	private String name;
	private int age;
	
	//constructor
	public Person1(){
		
	}
	
	public Person1(String name, int age){
		setName(name);
		setAge(age);
	}
	
	//methods
	public void showDetails(){
		System.out.println(name + " at age " + age);
	}
	
	//Setters
	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(int age){
		if(age>0)
			this.age=age;
		else
			this.age=0;
	}
	
	//Getters
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}

class A{
	
}