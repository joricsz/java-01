/**
	Sample User-defined method with parameter and with return value.
*/

public class MyMethod5{
	

	
	public static void main(String ... args){
		Greet g = new Greet();
		String str = g.Greetings("Joshua R");
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
	public static String Greetings(String name){
		return "Hello " + name + "!";
	}
}