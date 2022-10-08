import java.util.Scanner;
public class Triangle
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int choice;
		double side1=0.0, side2=0.0, side3=0.0, b=0.0, h=0.0;
		
		System.out.println("Menu");
		System.out.println("[1] Perimeter of the triangle.");
		System.out.println("[2] Area of the triangle");
		System.out.print("What do you want to compute? [1-2]: ");
		
		choice = s.nextInt();
		if (choice == 1)
		{
			System.out.println("Side 1: ");
			side1 = s.nextDouble();
			System.out.println("Side 2: ");
			side2 = s.nextDouble();
			System.out.println("Side 3: ");
			side3 = s.nextDouble();
			
			System.out.println("Perimeter: " + (side1+side2+side3));
			
		}
		else if (choice == 2)
		{
			System.out.println("Base: ");
			b = s.nextDouble();
			System.out.println("Height: ");
			h = s.nextDouble();
						
			System.out.println("Area: " + ((0.5) * b * h));
		}
		else
		{
			System.out.println("Invalid option");
		}
		
		
	}
}