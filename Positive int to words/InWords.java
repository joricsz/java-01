
import java.util.Scanner;

public class InWords{
	public static void main(String args[]){
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter a number from -9999 to 9999: ");
		int num = s.nextInt();

		if (num>=-9999 && num <=9999)
		{
			int thousands = num / 1000;
			int remHundreds = num % 1000;
			int hundreds = remHundreds / 100;
			int remTens = remHundreds % 100;
			int tens = remTens / 10;
			int ones =  remTens % 10;
		
		
			System.out.println("\nNumber: " + num + "\n");
			System.out.print("In Words: ");
		
			if (num == 0){
				System.out.print("Zero");
			}
		
			if (num < 0){
				System.out.print("Negative ");
			}
	
			switch(thousands)
			{
				case 9:
				case -9:
					System.out.print("Nine thousand ");
					break;
				case 8:
				case -8:
					System.out.print("Eight thousand ");
					break;
				case 7:
				case -7:
					System.out.print("Seven thousand ");
					break;
				case 6:
				case -6:
					System.out.print("Six thousand ");
					break;
				case 5:
				case -5:
					System.out.print("Five thousand ");
					break;
				case 4:
				case -4:
					System.out.print("Four thousand ");
					break;
				case 3:
				case -3:
					System.out.print("Three thousand ");
					break;
				case 2:
				case -2:
					System.out.print("Two thousand ");
					break;			
				case 1:
				case -1:
					System.out.print("One thousand ");		
			}//thousands

			switch (hundreds){
				case 9:
				case -9:
					System.out.print("Nine hundred ");
					break;
				case 8:
				case -8:
					System.out.print("Eight hundred ");
					break;
				case 7:
				case -7:
					System.out.print("Seven hundred ");
					break;
				case 6:
				case -6:
					System.out.print("Six hundred ");
					break;
				case 5:
				case -5:
					System.out.print("Five hundred ");
					break;
				case 4:
				case -4:
					System.out.print("Four hundred ");
					break;
				case 3:
				case -3:
					System.out.print("Three hundred ");
					break;
				case 2:
				case -2:
					System.out.print("Two hundred ");
					break;			
				case 1:
				case -1:
					System.out.print("One hundred ");		
			}//hundreds	

			switch (tens){
				case 9:
				case -9:
					System.out.print("Ninety ");
					break;
				case 8:
				case -8:
					System.out.print("Eighty ");
					break;
				case 7:
				case -7:
					System.out.print("Seventy ");
					break;
				case 6:
				case -6:
					System.out.print("Sixty");
					break;
				case 5:
				case -5:
					System.out.print("Fifty ");
					break;
				case 4:
				case -4:
					System.out.print("Forty");
					break;
				case 3:
				case -3:
					System.out.print("Thirty ");
					break;
				case 2:
				case -2:
					System.out.print("Twenty ");
		
			}//tens	
	
				if (tens == -1 || tens == 1){
					switch (ones){
						case 9:
						case -9:
							System.out.print("Nineteen ");
							break;
						case 8:
						case -8:
							System.out.print("Eighteen ");
							break;
						case 7:
						case -7:
							System.out.print("Seventeen ");
							break;
						case 6:
						case -6:
							System.out.print("Sixteen");
							break;
						case 5:
						case -5:
							System.out.print("Fifteen ");
							break;
						case 4:
						case -4:
							System.out.print("Forteen ");
							break;
						case 3:
						case -3:
							System.out.print("Thirteen");
							break;
						case 2:
						case -2:
							System.out.print("Twelve ");	
							break;
						case 1:
						case -1:
							System.out.print("Eleven ");	
							break;
						case 0:	
							System.out.print("Ten ");
					}//11-19
			}		
			else{
					switch (ones){
						case 9:
						case -9:
							System.out.print("Nine ");
							break;
						case 8:
						case -8:
							System.out.print("Eight ");
							break;
						case 7:
						case -7:
							System.out.print("Seven ");
							break;
						case 6:
						case -6:
							System.out.print("Six ");
							break;
						case 5:
						case -5:
							System.out.print("Five ");
							break;
						case 4:
						case -4:
							System.out.print("Four ");
							break;
						case 3:
						case -3:
							System.out.print("Three");
							break;
						case 2:
						case -2:
							System.out.print("Two ");
							break;					
						case 1:
						case -1:
							System.out.print("One ");
					
					}//1-9			
			}	

		}
		else
		{
			System.out.println("The number entered is out of range.");
		}	
		
	
	System.out.print("\n\n\n");	
	}
}