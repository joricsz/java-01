/**
	Sample User-defined method with parameter and with return value.
*/

public class MyMethod6{
	

	
	public static void main(String ... args){
		Greet g = new Greet(); 								//instantiate the greet class to access it
		String str = g.Greetings("Joshua R"); 					//call greetings method while supplying the argument
		//String greet=Greetings("Joshua");
		System.out.println(str);
	}
	/*
	private static String Greetings(String name){
		return "Hello " + name + "!";
	}
	*/
}
class Greet{
	public String Greetings(String name){
		InnerClass inner = new InnerClass();
		System.out.println(inner.Hi(name));
		return "Hello " + name + "!";
	}
	// iiner class or nested class
	
	static class InnerClass{
		public String Hi(String name){
			return "Hi " + name + "!";	
		}
	}
	
	
}