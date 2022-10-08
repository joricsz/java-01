
import java.util.Scanner;

public class RICAFRANCA_MP4{
		
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		
		print("Enter a number from -9999 to 9999: ");
		String num = sc.next();
		
		String sign = "" + num.charAt(0);
	
		if (num.equals("0")){
			println("\nNumber: " + num);
			println("\nIn Words: Zero");
		}
		else if (parseInt(num) <= 9999 && parseInt(num) > 0) {
			println("\nNumber: " + num);
			println("\nIn Words: " + NumToWords(parseInt(num)));
		}
		else if (sign.equals("-")){
			println("\nNumber: " + num);
			String NegativeNum = num.substring(1);
			if (parseInt(NegativeNum) <= 9999 && parseInt(NegativeNum) > 0 )
				println("\nIn Words: " + "Negative " + NumToWords(parseInt(NegativeNum)));
			else
				println("\nThe number entered is out of range.");	
		}
		else{
			println("\nThe number entered is out of range.");
		}	
    }
		static void print(String word){
			System.out.print(word);
		}
		static void println(String word){
			System.out.println(word);
		}
		static int parseInt(String num){
			return Integer.parseInt(num);
		}
		
	public static String NumToWords(int num){
	
	String words = "";
    String unitsArray[] = {"", "One", "Two", "Three", "Four", "Five", "Six", 
                      "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                      "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                      "Eighteen", "Nineteen" };
	String tensArray[] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                      "Sixty", "Seventy", "Eighty", "Ninety" };
	// check if number is divisible by 1 thousand				  
	if ((num / 1000) > 0){
	    words += NumToWords(num / 1000) + " Thousand ";
	    num %= 1000; 
	}
	// check if number is divisible by 1 hundred
	if ((num / 100) > 0){
	     words += NumToWords(num / 100) + " Hundred ";
	     num %= 100;
	}
	if (num > 0){
	     // check if number is within teens
	     if (num < 20){ 
            // get the corresponding value from units array
            words += unitsArray[num];
				} 
		else{
            // get the corresponding value from tens array
            words += tensArray[num / 10]; 
            if ((num % 10) > 0) {
		    words += " " + unitsArray[num % 10];
              }  
			}
        }
	  return words;
	}
}