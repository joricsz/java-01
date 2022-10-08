// This program simply asks for the name of the user
import java.util.Scanner;
public class Hello{
	public static void main(String ... args){
	Scanner x = new Scanner(System.in);
	
	System.out.println("Please type your full name");
	
	String Name = x.next();
	
	System.out.print("Welcome back Master " + Name + "!");
	}
	
}