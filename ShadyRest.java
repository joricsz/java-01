import java.util.Scanner;
public class ShadyRest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int bed, view=0;
		double price = 0.00, additional=0.00;
		
		System.out.println("Bed Type:");
		System.out.println("[1] Queen bed");
		System.out.println("[2] King bed");
		System.out.println("[3] King + pull-out couch");
		System.out.println("Choose bed type [1-3]: ");
		bed = s.nextInt();
		
		if (bed >= 1 && bed <= 3)
		{
			System.out.println("View Type");
			System.out.println("[1] Lake view");
			System.out.println("[2] Park view");
			System.out.println("Choose view [1-2]:");
			view = s.nextInt();
			
			if (bed==1)
			{
				System.out.println("Bed type: [1] Queen bed");
				price = 125.00;
			}
			else if (bed==2)
			{
				System.out.println("Bed type: [2] King bed");
				price = 139.00;
			}
			else 
			{
				System.out.println("Bed type: [3] King + pull-out couch");
				price = 165.00;
			}
			
			if (view == 1)
			{
				System.out.println("Lake view");
				additional = 15.0;
			}
			else if (view == 2)
				System.out.println("Park view");
			else
				System.out.println("Invalid view code");
		}
		else
			{
				price = 0.00;
				System.out.println("Invalid bed type");
			}
		
		System.out.println("Price: " + price);
		System.out.println("Additional: " + price);
		System.out.println("Total: " + (price + additional));
		
			
	}
}