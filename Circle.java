/** This program will compute for the area and circumference of the circle.
Analysis:
variables: area, circumference, r
constant: pi = 3.1416
input variable: r
output variables: area, circumference
formulae: area = pi * r-squared, circumference = 2 * pi * r
*/

import java.util.Scanner;
public class Circle{
	public static void main(String args [] ){
		Scanner x = new Scanner(System.in);
		
		double area;
		double circumference;
		double r;
		final double PI = 3.1416;
		System.out.println("Compute the area and circumference of a circle");
		System.out.println("Enter value for the radius");
		r = x.nextDouble();
		area = PI * (r * r);
		circumference = 2 * ( PI * r );
		
		System.out.print("If the raidus is " + r + ", then the area of the circle is " + area + "." + "\nWhile the circumference of the circle is " + circumference + "."); 
		}
}