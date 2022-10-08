import java.util.Scanner;

public class ShadyRestaurant{
	public static void main (String ... args){
		double price = 0.00d, totalPrice = 0.00d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rooms Menu");
		System.out.println("[1] Queen Bed");
		System.out.println("[2] King Bed");
		System.out.println("[3] King and a Pull Out");
		System.out.println("Choose room [1-3]: ");
		int bed = sc.nextInt();
		
		if(bed==1 || bed==2 || bed==3){ //bed>=1 && bed<=3
		switch(bed){
			case 1: price = 125.00; break;
			case 2: price = 139.00; break;
			case 3: price = 165.00;
		}
		System.out.println("Price: " + price);
		
		System.out.println("View Menu");
		System.out.println("[1] Lake View");
		System.out.println("[2] Park View");
		System.out.println("Choose view [1-2]: ");
		int view = sc.nextInt();
		
		if(view>=1 && view<=2){
			if(view==1) price +=15;
		}
		else
		{
			System.out.println("Invalid view code");
			price +=15;
		}
	}
	else{
		System.out.println("Invalid bed number");
		System.out.println("Price: 0.00");
	}
	
	System.out.printf("Price: %.2f", price);
	
	
	
	
	
	}
}