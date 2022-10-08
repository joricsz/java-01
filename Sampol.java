/*This program will take two numbers and display its sum, difference, product, and quotient.
Analysis:
variables: Num1, Num2, sum, product, difference, quotient
input variables: Num1, Num2
output variables: sum, product, difference, quotient
Formulae:
sum = Num1 + Num2
product = Num1 * Num2
difference = Num1 - Num2
quotient = Num1 / Num2
*/

import java.util.Scanner;
public class Sampol{
	public static void main(String ... args){
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		double sum, difference, product, quotient;
		double Num1, Num2; 
		
		System.out.println("Input the first number.");
		Num1 = x.nextDouble();
		
		System.out.println("Input the second number.");
		Num2 = y.nextDouble();
		
		sum = Num1 + Num2;
		difference = Num1 - Num2;
		product = Num1 * Num2;
		quotient = Num1 / Num2;
		
		System.out.println("The sum of " + Num1 + " and " + Num2 + " is " + sum);
		System.out.println("The difference of " + Num1 + " and " + Num2 + " is " + difference);
		System.out.println("The product of " + Num1 + " and " + Num2 + " is " + product);
		System.out.print("The quotient of " + Num1 + " and " + Num2 + " is " + quotient);
	}
}