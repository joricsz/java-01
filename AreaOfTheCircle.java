/*
This program will compute the area of the circle.
Analysis:
Variables: area, r
input variable: r
output variable: area
constant: pi = 3.1416
The formula is: are = pi * r-squared
*/

import java.util.Scanner;
public class AreaOfTheCircle{
	public static void main(String ... args){
		Scanner x = new Scanner(System.in);
		
		double area;
		int r;
		final double PI = 3.1416;
		System.out.println("\tCompute the area of the circle");
		System.out.print("Enter value for radius: ");
		r = x.nextInt();
		area = 3.1416 * (r * r);
		
		System.out.println("If the radius is " + r + ", \nthen the area of the circle is " + area );
	
	}
}