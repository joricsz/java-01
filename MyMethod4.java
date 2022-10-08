/**
	Sample User-defined method without parameter but with return value.
*/

public class MyMethod4{
	public static void main(String ... args){
		System.out.println(Greetings() + "Joshua!");
	}
	
	private static String Greetings(){
		return "Hi ";
	}
}