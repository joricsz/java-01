
import java.util.Scanner;

public class Polygon{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int s, n, r;
		str d;
		
		System.out.println("Enter the length of side(s) of a regular polygon");
		s = sc.nextInt();
		System.out.println("Enter the number of side(s) of a regular polygon");
		n = sc.nextInt();
		System.out.println("Enter the apothem of the regular polygon");
		r = sc.nextInt();
		
		Display d = new Display();
		String str = d.display();	
		System.out.println(str);
		}
	static class Display{ 
		public String display(){
			Perimeter p = new Perimeter();
			System.out.println(p.perimeter());
			return ("The area of the of the regular polygon is: " + (r*perimeter)/2);
		}
	}
	static class Perimeter{
		public int perimeter(){
			Perimeter p = new Perimeter();
			return ("The perimeter of the of the regular polygon is: " + s*n);
		}
	}
	
}
