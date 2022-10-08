import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.println("Enter an integer: ");
		number = s. nextInt();
		
		if ((number % 2)==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		
		
	}
}