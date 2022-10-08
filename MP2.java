/*
public class MP2{
	public static void main(String ... args){
		String l = "10.25";
		String w = "5.75";
		System.out.println(Double.parseDouble(l) * Float.parseFloat(w));
	}
}
*/

/**
Analysis:;
varibales: a, r
input variables: r
output variables: a
constant: PI
formula: a = PI * ( r * r )
*/


import java.util.Scanner;
public class MP2{
	public static void main(String ... args){
	Scanner sc = new Scanner(System.in);
	float a;
	int r;
	final float PI = 3.14159f;
	
	System.out.print("Enter value for r: ");
	r = sc.nextInt();
	
	a = PI * (r * r);
	
	// 4 decimal places
	System.out.printf("The area of the circle: %.4f", a);
	//System.out.printf(" %.4f %n ", a);
	
	}
}
