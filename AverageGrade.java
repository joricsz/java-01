/* This program will compute for the Average Grade of the student and determine whether its considered as PASSED or FAILED depending on their Prelims and Finals grade input.     
Analysis:
variables: AvgGrade, P, F
input variables: P, F
output variable: AVERAGE GRADE
Formula: AVERAGE GRADE = ( P + F ) / 2
*/

import java.util.Scanner;
public class AverageGrade{
	public static void main(String ... args){
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		double P;
		double F;
 		double AvgGrade;
		
		System.out.println("Input your Preliminary grade");
		P = x.nextDouble();
		
		System.out.println("Input your Finals grade");
		F = y.nextDouble();
		
		AvgGrade = ( P + F ) / 2;
		
		System.out.println("Your Average grade is " + AvgGrade + " and you");
		
		if (AvgGrade <= 60){
			System.out.println("FAILED");
		} 
		else {
			System.out.println("PASSED");
		}
	}
}