/**
	Sample User-defined method with parameter and without return value.
*/

import java.util.Scanner;
public class MyMethod2{
	

	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		
		String n = sc.next();
		
		Greetings(n);
	}
	
	private static void Greetings(String name){
		System.out.println("Hello " + name);
	}
}