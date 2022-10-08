import java.util.Scanner;

public class FactorialRecursion{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int num;
		
		do{
			System.out.print("Enter a positive number: ");
			num = sc.nextInt();
		}while(num<0);
		
		int f = factorial(num);
		
		System.out.println("The factorial of " + num + " is " + f + "\n");				
	}
		
	private static int factorial(int n){
		/**
		if(n==0)
			return 1;
		else
			return n * factorial(n-1);
		*/
		return (n==0?1:n*factorial(n-1));
	
	}
}