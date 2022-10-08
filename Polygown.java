import java.util.Scanner;


public class Polygown{
	
		static int s, n, r;
	
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of side(s) of a regular polygon");
		s = sc.nextInt();
		System.out.println("Enter the number of side(s) of a regular polygon");
		n = sc.nextInt();
		System.out.println("Enter the apothem of the regular polygon");
		r = sc.nextInt();
		
		System.out.println(display() + perimeter() + " and " + area() + ", respectively.");
	}
	static void perimeter(){
		return (n*s);
	}
	static void area(){
		return ((r*perimeter)/2);		
	}
	static void display(){
		return "The perimeter and area of the regular polygon are ";
	}
}

/*private static double display(){
		return "The perimeter of the of the regular polygon is: " + perimeter + "."\n + "The area of the of the regular polygon is: + area + ".";
*/