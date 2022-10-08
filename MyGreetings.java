
public class MyGreetings{
	public static void main(String ... args){
		Greet g1 = new Greet();
		System.out.println(g1.sayHi("Kekw"));
	
		Greet g2 = new Greet();
		System.out.println(g2.sayHello("Kekw"));
		System.out.println(Greet.sayHello("Kekw"));
		//System.out.println(Greet.sayHi("Kekwing")); Error: non-static method cannot be referenced from a static context.
	
		GreetMe gm = new GreetMe();
		System.out.println(gm.GreetHi("Simp"));
		System.out.println(GreetMe.GreetHello("Simp"));
	}
	
	private static class GreetMe{
			String GreetHi(String name){
				return "Hi " + name + "!";
			}
			static String GreetHello(String name){
				return "Hello " + name + "!";
			}
	}	
}

class Greet{
	public String sayHi(String name){
		return "Hi " + name + "!";
	}
	
	public static String sayHello(String name){
		return "Hello " + name + "!";
	}
}